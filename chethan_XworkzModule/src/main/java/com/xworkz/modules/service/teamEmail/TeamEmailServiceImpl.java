package com.xworkz.modules.service.teamEmail;

import com.xworkz.modules.dao.ModuleDAO;
import com.xworkz.modules.dao.event.EventDAO;
import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.AddTeamMemberEntity;
import com.xworkz.modules.entity.event.TeamEventEntity;
import com.xworkz.modules.entity.event.TeamEventResponseEntity;
import com.xworkz.modules.utils.OTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;@Service
public class TeamEmailServiceImpl implements TeamEmailService {

    @Autowired
    private ModuleDAO moduleDAO;

    @Autowired
    EventDAO eventDAO;

    @Autowired
    private OTP otp;

    public boolean createEventAndSendMail(String teamName, String title, String message) {

        if (teamName == null || teamName.trim().isEmpty()) {
            return false;
        }

        boolean allSent = true;

        TeamEventEntity event = new TeamEventEntity();
        event.setTeamName(teamName);
        event.setTitle(title);
        event.setDescription(message);

        eventDAO.saveEvent(event);
        System.out.println(event.getId()+"      841295wesrdtfyguhijkol");

        List<AddTeamMemberEntity> members =
                moduleDAO.getTeamMemberByTeamName(teamName);

        AddTeamEntity team =
                moduleDAO.getTeamByTeamName(teamName);

        String headEmail = null;
        if (team != null) {
            headEmail = team.getEmail();
        }

        // Send to team members
        if (members != null) {
            for (AddTeamMemberEntity member : members) {

                if (member.getEmail() == null || member.getEmail().isEmpty()) {
                    continue;
                }

                try {
                    String pageLink =
                            "http://192.168.141.125:8080/chethan_XworkzModule/eventResponsePage?eventId="
                                    + event.getId()
                                    + "&email="
                                    + member.getEmail();

                    String htmlBody =
                            "<h3>" + title + "</h3>"
                                    + "<p>" + message + "</p>"
                                    + "<br><br>"
                                    + "<a href='" + pageLink + "'>Click Here To Respond</a>";

                    otp.sendHtmlMail(member.getEmail(), title, htmlBody);

                } catch (Exception e) {
                    allSent = false;
                }
            }
        }

        // Send to team head only if not already included
        if (headEmail != null && !headEmail.isEmpty()) {

            boolean alreadySent = false;

            if (members != null) {
                for (AddTeamMemberEntity member : members) {
                    if (headEmail.equalsIgnoreCase(member.getEmail())) {
                        alreadySent = true;
                        break;
                    }
                }
            }

            if (!alreadySent) {
                try {
                    String pageLink =
                            "http://192.168.141.125:8080/chethan_XworkzModule/eventResponsePage?eventId="
                                    + event.getId()
                                    + "&email="
                                    + headEmail;

                    String htmlBody =
                            "<h3>" + title + "</h3>"
                                    + "<p>" + message + "</p>"
                                    + "<br><br>"
                                    + "<a href='" + pageLink + "'>Click Here To Respond</a>";

                    otp.sendHtmlMail(headEmail, title, htmlBody);

                } catch (Exception e) {
                    allSent = false;
                }
            }
        }

        return allSent;
    }


    @Override
    public boolean saveResponse(int eventId, String email, String response) {

        TeamEventResponseEntity existing =
                eventDAO.findResponse(eventId, email);

        if (existing != null) {
            return false; // already responded
        }

        TeamEventResponseEntity entity =
                new TeamEventResponseEntity();

        entity.setEventId(eventId);
        entity.setMemberEmail(email);
        entity.setResponse(response);

        return eventDAO.saveEventResponse(entity);
    }



}
