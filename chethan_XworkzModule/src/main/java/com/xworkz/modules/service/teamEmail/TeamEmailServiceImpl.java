package com.xworkz.modules.service.teamEmail;

import com.xworkz.modules.dao.ModuleDAO;
import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.AddTeamMemberEntity;
import com.xworkz.modules.utils.OTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;@Service
public class TeamEmailServiceImpl implements TeamEmailService {

    @Autowired
    private ModuleDAO moduleDAO;

    @Autowired
    private OTP otp;
    @Override
    public boolean sendMailToTeam(String teamName, String message) {

        if (teamName == null || teamName.trim().isEmpty()) {
            return false;
        }

        boolean allSent = true;

        List<AddTeamMemberEntity> members =
                moduleDAO.getTeamMemberByTeamName(teamName);

        AddTeamEntity team =
                moduleDAO.getTeamByTeamName(teamName);

        String headEmail = null;

        if (team != null) {
            headEmail = team.getEmail();
        }

        // Send to members
        if (members != null) {
            for (AddTeamMemberEntity member : members) {

                if (member.getEmail() == null || member.getEmail().isEmpty()) {
                    continue;
                }

                try {
                    otp.sendSimpleMessage(
                            member.getEmail(),
                            "Team Notification",
                            message
                    );
                } catch (Exception e) {
                    allSent = false;
                }
            }
        }

        // Send to team head only if not already included
        if (headEmail != null) {

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
                    otp.sendSimpleMessage(
                            headEmail,
                            "Team Notification",
                            message
                    );
                } catch (Exception e) {
                    allSent = false;
                }
            }
        }

        return allSent;
    }

}
