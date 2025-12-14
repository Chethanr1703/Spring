package com.xworkz.dependency;


import com.xworkz.dependency.bank.Account;
import com.xworkz.dependency.bank.Bank;
import com.xworkz.dependency.block.Block;
import com.xworkz.dependency.block.CompanyBlock;
import com.xworkz.dependency.book.Book;
import com.xworkz.dependency.book.BookSeller;
import com.xworkz.dependency.calendar.Calendar;
import com.xworkz.dependency.calendar.Meeting;
import com.xworkz.dependency.collage.College;
import com.xworkz.dependency.collage.Student;
import com.xworkz.dependency.company.Company;
import com.xworkz.dependency.company.Employe;
import com.xworkz.dependency.configure.CoreConfigure;
import com.xworkz.dependency.contacts.Contact;
import com.xworkz.dependency.contacts.PhoneBookContact;
import com.xworkz.dependency.controller.ControllerLayer;
import com.xworkz.dependency.controller.ServiceLayer;
import com.xworkz.dependency.country.Country;
import com.xworkz.dependency.country.State;
import com.xworkz.dependency.course.Course;
import com.xworkz.dependency.course.Subject;
import com.xworkz.dependency.defence.Army;
import com.xworkz.dependency.defence.Defence;
import com.xworkz.dependency.department.Department;
import com.xworkz.dependency.exam.Exam;
import com.xworkz.dependency.exam.Result;
import com.xworkz.dependency.floor.Floor;
import com.xworkz.dependency.floor.Room;
import com.xworkz.dependency.galaxy.Galaxy;
import com.xworkz.dependency.galaxy.SolarSystem;
import com.xworkz.dependency.hospital.Doctor;
import com.xworkz.dependency.hospital.Hospital;
import com.xworkz.dependency.hotel.Hotel;
import com.xworkz.dependency.hotel.RoomHotel;
import com.xworkz.dependency.kitchen.Chef;
import com.xworkz.dependency.kitchen.Kitchen;
import com.xworkz.dependency.library.BookLib;
import com.xworkz.dependency.library.LibraryBook;
import com.xworkz.dependency.librarysh.Library;
import com.xworkz.dependency.librarysh.Shelf;
import com.xworkz.dependency.loksabha.LokSabha;
import com.xworkz.dependency.loksabha.Seat;
import com.xworkz.dependency.magazine.Magazine;
import com.xworkz.dependency.magazine.Page;
import com.xworkz.dependency.meeting.Invitee;
import com.xworkz.dependency.meeting.MeetingOffice;
import com.xworkz.dependency.mobile.Mobile;
import com.xworkz.dependency.mobile.PhoneBook;
import com.xworkz.dependency.movie.Pvr;
import com.xworkz.dependency.movie.Screen;
import com.xworkz.dependency.school.School;
import com.xworkz.dependency.school.Teacher;
import com.xworkz.dependency.state.City;
import com.xworkz.dependency.state.StateCity;
import com.xworkz.dependency.techpark.TechBlock;
import com.xworkz.dependency.techpark.TechPark;
import com.xworkz.dependency.ticket.Passenger;
import com.xworkz.dependency.ticket.Ticket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.xworkz.dependency.mall.Mall;
import com.xworkz.dependency.mall.Shops;

import com.xworkz.dependency.mining.MiningSite;
import com.xworkz.dependency.mining.Excavator;

import com.xworkz.dependency.multispecalityhospital.MultiSpecalityHospital;
import com.xworkz.dependency.multispecalityhospital.Patients;

import com.xworkz.dependency.music.MusicSystem;
import com.xworkz.dependency.music.Speaker;

import com.xworkz.dependency.news.NewsChannel;
import com.xworkz.dependency.news.Reporter;

import com.xworkz.dependency.passport.PassportOffice;
import com.xworkz.dependency.passport.PassportOfficer;

import com.xworkz.dependency.policestation.PoliceStation;
import com.xworkz.dependency.policestation.PoliceOfficer;

import com.xworkz.dependency.port.Port;
import com.xworkz.dependency.port.Crane;

import com.xworkz.dependency.postoffice.PostOffice;
import com.xworkz.dependency.postoffice.Postman;

import com.xworkz.dependency.power.PowerPlant;
import com.xworkz.dependency.power.Turbine;

import com.xworkz.dependency.projector.Cinema;
import com.xworkz.dependency.projector.Projector;

import com.xworkz.dependency.restaurant.Restaurant;
import com.xworkz.dependency.restaurant.ChefRes;

import com.xworkz.dependency.runway.KiaAirport;
import com.xworkz.dependency.runway.Runway;

import com.xworkz.dependency.satellite.WeatherReport;
import com.xworkz.dependency.satellite.Satellite;

import com.xworkz.dependency.shop.Shop;
import com.xworkz.dependency.shop.Owner;

import com.xworkz.dependency.space.SpaceMission;
import com.xworkz.dependency.space.Rocket;

import com.xworkz.dependency.dam.Dam;
import com.xworkz.dependency.dam.Gate;

import com.xworkz.dependency.airportsecurity.AirportSecurity;
import com.xworkz.dependency.airportsecurity.Scanner;

import com.xworkz.dependency.amazon.Amazon;
import com.xworkz.dependency.amazon.Product;

import com.xworkz.dependency.apartment.Apartment;
import com.xworkz.dependency.apartment.Security;

import com.xworkz.dependency.atm.Atm;
import com.xworkz.dependency.atm.Cash;

import com.xworkz.dependency.banklocker.BankLocker;
import com.xworkz.dependency.banklocker.Assest;

import com.xworkz.dependency.courtcase.CourtCase;
import com.xworkz.dependency.courtcase.Lawyer;

import com.xworkz.dependency.datacenter.DataCenter;
import com.xworkz.dependency.datacenter.Server;

import com.xworkz.dependency.director.Movie;
import com.xworkz.dependency.director.Director;

import com.xworkz.dependency.election.Election;
import com.xworkz.dependency.election.VotingMachine;

import com.xworkz.dependency.factory.Factory;
import com.xworkz.dependency.factory.Machine;

import com.xworkz.dependency.fire.FireStation;
import com.xworkz.dependency.fire.FireEngine;

import com.xworkz.dependency.gym.Gym;
import com.xworkz.dependency.gym.Trainer;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfigure.class);

        Hotel hotel =applicationContext.getBean(Hotel.class);
        hotel.setHotelId(1256);
        hotel.setHotelName("ASHOKA");

        RoomHotel room = applicationContext.getBean(RoomHotel.class);
        room.setRoomNo(5656);
        room.setNoOfBed(3);
        hotel.setRoom(room);

        System.out.println("Printing message of Hotel Type  :"+hotel);
        System.out.println("Printing message of Room type  :"+room);

        System.out.println("-----------------------------------------------------");
        Hotel hotel1 = applicationContext.getBean(Hotel.class);
        RoomHotel room1 = applicationContext.getBean(RoomHotel.class);
        System.out.println("Without setting the value for Hotel  :"+hotel1);
        System.out.println("Without setting the value for Room   :"+room1);


        System.out.println("---------------------------------------------------");
        Company company = applicationContext.getBean(Company.class);
        company.setCompanyId(1);
        company.setCompanyName("HCL");

        Employe employe = applicationContext.getBean(Employe.class);
        employe.setId(2589);
        employe.setName("ABHI");
        company.setEmploye(employe);
        System.out.println(company);
        System.out.println(employe);

        System.out.println("---------------------------------------------");

        Bank bank = applicationContext.getBean(Bank.class);
        bank.setId(1);
        bank.setBankName("SBI");

        Account account = applicationContext.getBean(Account.class);
        account.setId(12);
        account.setName("Saving");

        bank.setAccount(account);
        System.out.println(bank);
        System.out.println(account);

        System.out.println("--------------------------");

        College college = applicationContext.getBean(College.class);
        college.setId(1234);
        college.setName("SAIT");
        Student student = applicationContext.getBean(Student.class);
        student.setId(12345);
        student.setName("CHETHAN");
        college.setStudent(student);

        System.out.println(college);
        System.out.println(student);

        System.out.println("--------------------------------------");



        Kitchen kitchen = applicationContext.getBean(Kitchen.class);
        kitchen.setId(3);
        kitchen.setName("Main Kitchen");

        Chef chef = applicationContext.getBean(Chef.class);
        chef.setId(301);
        chef.setChefName("Ramesh");

        kitchen.setChef(chef);

        System.out.println(kitchen);
        System.out.println(chef);
        System.out.println("---------------------------------------------------");

        System.out.println("---------------------------------------------------");

        Hospital hospital = applicationContext.getBean(Hospital.class);
        hospital.setId(4);
        hospital.setName("Apollo");

        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.setId(401);
        doctor.setDoctorName("Dr. Kumar");

        hospital.setDoctor(doctor);

        System.out.println(hospital);
        System.out.println(doctor);


        System.out.println("---------------------------------------------------");

        System.out.println("---------------------------------------------------");
        School school = applicationContext.getBean(School.class);
        school.setId(6);
        school.setName("Government School");

        Teacher teacher = applicationContext.getBean(Teacher.class);
        teacher.setId(601);
        teacher.setTeacherName("Lakshmi");

        school.setTeacher(teacher);

        System.out.println(school);
        System.out.println(teacher);

        System.out.println("---------------------------------------------------");

        LibraryBook library = applicationContext.getBean(LibraryBook.class);
        library.setId(8);
        library.setName("Central Library");

        BookLib bookLib = applicationContext.getBean(BookLib.class);
        bookLib.setId(801);
        bookLib.setBookName("Java Basics");

        library.setBookLib(bookLib);

        System.out.println(library);
        System.out.println(bookLib);


        System.out.println("---------------------------------------------------");

        Department department = applicationContext.getBean(Department.class);
        department.setId(9);
        department.setDepartmentName("IT");

        Doctor manager = applicationContext.getBean(Doctor.class);
        manager.setId(901);
        manager.setDoctorName("Suresh");

        System.out.println(department);
        System.out.println(manager);
        System.out.println("---------------------------------------------------");

        Block block =applicationContext.getBean(Block.class);
        block.setId(12);
        block.setBlockName("A");
        CompanyBlock companyBlock =applicationContext.getBean(CompanyBlock.class);
        companyBlock.setId(12365);
        companyBlock.setCompanyName("WWW");
        block.setCompany(companyBlock);

        System.out.println(companyBlock);
        System.out.println(block);

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        ControllerLayer controller = applicationContext.getBean(ControllerLayer.class);
        controller.setId(10);
        controller.setName("UserController");

        ServiceLayer service = applicationContext.getBean(ServiceLayer.class);
        service.setId(1001);
        service.setName("UserService");

        controller.setServiceLayer(service);

        System.out.println(controller);
        System.out.println(service);


        System.out.println("---------------------------------------------------");

        System.out.println("---------------------------------------------------");

        Calendar calendar = applicationContext.getBean(Calendar.class);
        calendar.setId(1);
        calendar.setName("Office Calendar");

        Meeting meeting = applicationContext.getBean(Meeting.class);
        meeting.setId(101);
        meeting.setMeetingTitle("Project Discussion");


        calendar.setMeeting(meeting);

        System.out.println(calendar);
        System.out.println(meeting);

        System.out.println("-----------------------------------------");
        BookSeller bookSeller = applicationContext.getBean(BookSeller.class);
        bookSeller.setId(123);
        bookSeller.setName("JEEVITH");
        Book book = applicationContext.getBean(Book.class);
        book.setId(56980);
        book.setBookName("Math222");
        bookSeller.setBook(book);

        System.out.println(bookSeller);
        System.out.println(book);
        System.out.println("---------------------------------------------------");



        PhoneBookContact phoneBook = applicationContext.getBean(PhoneBookContact.class);
        phoneBook.setId(201);
        phoneBook.setPhoneBookName("Personal Contacts");

        Contact contact = applicationContext.getBean(Contact.class);
        contact.setId(2001);
        contact.setContactName("Abhi");

        phoneBook.setContact(contact);

        System.out.println(phoneBook);
        System.out.println(contact);
        System.out.println("---------------------------------");

        System.out.println("---------------------------------------------------");

        Country country = applicationContext.getBean(Country.class);
        country.setId(4);
        country.setName("India");

        State state = applicationContext.getBean(State.class);
        state.setId(401);
        state.setStateName("Karnataka");



        country.setState(state);

        System.out.println(country);
        System.out.println(state);

        System.out.println("-----------------------------------------");
        StateCity state1 = applicationContext.getBean(StateCity.class);
        state.setId(401);
        state.setStateName("Karnataka");

        City city = applicationContext.getBean(City.class);
        city.setId(4001);
        city.setCityName("Bengaluru");

        state.setCity(city);
        System.out.println(state1);
        System.out.println(city);
        System.out.println("-------------------------------------------------");

        Library library1 = applicationContext.getBean(Library.class);
        library1.setId(1);
        library1.setName("Central Library");

        Shelf shelf = applicationContext.getBean(Shelf.class);
        shelf.setId(101);
        shelf.setShelfName("Computer Science Shelf");

        library1.setShelf(shelf);

        System.out.println(library1);
        System.out.println(shelf);
        System.out.println("---------------------------");
        LokSabha lokSabha = applicationContext.getBean(LokSabha.class);
        lokSabha.setId(2);
        lokSabha.setName("Lok Sabha");

        Seat seat = applicationContext.getBean(Seat.class);
        seat.setId(201);
        seat.setSeatNumber("Seat-45");


        lokSabha.setSeat(seat);

        System.out.println(lokSabha);
        System.out.println(seat);

        System.out.println("---------------------------------------------------");

        Magazine magazine = applicationContext.getBean(Magazine.class);
        magazine.setId(3);
        magazine.setName("Tech Monthly");

        Page page = applicationContext.getBean(Page.class);
        page.setId(301);
        page.setPageNumber("Page 10");


        magazine.setPage(page);

        System.out.println(magazine);
        System.out.println(page);

        System.out.println("---------------------------------------------------");

        Pvr pvr = applicationContext.getBean(Pvr.class);
        pvr.setId(4);
        pvr.setName("PVR Orion Mall");

        Screen screen = applicationContext.getBean(Screen.class);
        screen.setId(401);
        screen.setScreenName("Screen 1");


        pvr.setScreen(screen);

        System.out.println(pvr);
        System.out.println(screen);
        System.out.println("---------------------------------------------------");

        Galaxy galaxy = applicationContext.getBean(Galaxy.class);
        galaxy.setId(5);
        galaxy.setName("Milky Way");

        SolarSystem solarSystem = applicationContext.getBean(SolarSystem.class);
        solarSystem.setId(501);
        solarSystem.setSystemName("Solar System");


        galaxy.setSolarSystem(solarSystem);

        System.out.println(galaxy);
        System.out.println(solarSystem);


        System.out.println("---------------------------------");
        Floor floor = applicationContext.getBean(Floor.class);


        Room room3 = applicationContext.getBean(Room.class);
        room3.setId(6001);
        room3.setType("Conference Room");

        floor.setRoom(room3);

        System.out.println(floor);
        System.out.println(room3);
        System.out.println("-------------------------------");



        MeetingOffice meeting1 = applicationContext.getBean(MeetingOffice.class);
        meeting1.setId(101);
        meeting1.setMeetingTitle("Project Discussion");

        Invitee invitee = applicationContext.getBean(Invitee.class);
        invitee.setId(1001);
        invitee.setInviteeName("Chethan");

        meeting1.setInvitee(invitee);

        System.out.println(meeting1);
        System.out.println(invitee);

        System.out.println("---------------------------------------");
        Mobile mobile = applicationContext.getBean(Mobile.class);
        mobile.setId(2);
        mobile.setName("Samsung Mobile");

        PhoneBook phoneBook1 = applicationContext.getBean(PhoneBook.class);
        phoneBook1.setId(201);
        phoneBook1.setPhoneBookName("Personal Contacts");


        mobile.setPhoneBook(phoneBook1);

        System.out.println(mobile);
        System.out.println(phoneBook1);
        System.out.println(contact);

        System.out.println("---------------------------------------------------");

        Course course = applicationContext.getBean(Course.class);
        course.setId(1);
        course.setName("Computer Science");

        Subject subject = applicationContext.getBean(Subject.class);
        subject.setId(101);
        subject.setName("Data Structures");

        course.setSubject(subject);

        System.out.println(course);
        System.out.println(subject);
        System.out.println("---------------------------------------------------");

        Defence defence = applicationContext.getBean(Defence.class);
        defence.setId(2);
        defence.setName("Indian Defence");

        Army army = applicationContext.getBean(Army.class);
        army.setId(201);
        army.setArmyName("Indian Army");

        defence.setArmy(army);

        System.out.println(defence);
        System.out.println(army);
        System.out.println("---------------------------------------------------");

        Exam exam = applicationContext.getBean(Exam.class);
        exam.setId(3);
        exam.setName("Semester Exam");

        Result result = applicationContext.getBean(Result.class);
        result.setId(301);
        result.setResultName("Pass");

        exam.setResult(result);

        System.out.println(exam);
        System.out.println(result);
        System.out.println("---------------------------------------------------");

        TechPark techPark = applicationContext.getBean(TechPark.class);
        techPark.setId(4);
        techPark.setName("Manyata Tech Park");

        TechBlock block1 = applicationContext.getBean(TechBlock.class);
        block1.setId(401);
        block1.setBlockName("Block A");


        techPark.setBlock(block1);

        System.out.println(techPark);
        System.out.println(block1);

        System.out.println("---------------------------------------------------");

        Ticket ticket = applicationContext.getBean(Ticket.class);
        ticket.setId(5);
        ticket.setName("Bus Ticket");

        Passenger passenger = applicationContext.getBean(Passenger.class);
        passenger.setId(501);
        passenger.setPassengerName("Ravi");

        ticket.setPassenger(passenger);

        System.out.println(ticket);
        System.out.println(passenger);
        System.out.println("-------------------------------------");

        Mall mall = applicationContext.getBean(Mall.class);
        System.out.println(mall);
        System.out.println(mall.getShop());

        System.out.println("-------------------------------------");

        MiningSite miningSite = applicationContext.getBean(MiningSite.class);
        System.out.println(miningSite);
        System.out.println(miningSite.getExcavator());

        System.out.println("-------------------------------------");

        MultiSpecalityHospital multiSpecalityHospital =
                applicationContext.getBean(MultiSpecalityHospital.class);
        System.out.println(multiSpecalityHospital);
        System.out.println(multiSpecalityHospital.getPatients());

        System.out.println("-------------------------------------");

        MusicSystem musicSystem = applicationContext.getBean(MusicSystem.class);
        System.out.println(musicSystem);
        System.out.println(musicSystem.getSpeaker());

        System.out.println("-------------------------------------");

        NewsChannel newsChannel = applicationContext.getBean(NewsChannel.class);
        System.out.println(newsChannel);
        System.out.println(newsChannel.getReporter());

        System.out.println("-------------------------------------");

        PassportOffice passportOffice =
                applicationContext.getBean(PassportOffice.class);
        System.out.println(passportOffice);
        System.out.println(passportOffice.getPassportOfficer());

        System.out.println("-------------------------------------");

        PoliceStation policeStation =
                applicationContext.getBean(PoliceStation.class);
        System.out.println(policeStation);
        System.out.println(policeStation.getPoliceOfficer());

        System.out.println("-------------------------------------");

        Port port = applicationContext.getBean(Port.class);
        System.out.println(port);
        System.out.println(port.getCrane());

        System.out.println("-------------------------------------");

        PostOffice postOffice =
                applicationContext.getBean(PostOffice.class);
        System.out.println(postOffice);
        System.out.println(postOffice.getPostman());

        System.out.println("-------------------------------------");

        PowerPlant powerPlant =
                applicationContext.getBean(PowerPlant.class);
        System.out.println(powerPlant);
        System.out.println(powerPlant.getTurbine());

        System.out.println("-------------------------------------");

        Cinema cinema = applicationContext.getBean(Cinema.class);
        System.out.println(cinema);
        System.out.println(cinema.getProjector());

        System.out.println("-------------------------------------");

        Restaurant restaurant =
                applicationContext.getBean(Restaurant.class);
        System.out.println(restaurant);
        System.out.println(restaurant.getChef());

        System.out.println("-------------------------------------");

        KiaAirport kiaAirport =
                applicationContext.getBean(KiaAirport.class);
        System.out.println(kiaAirport);
        System.out.println(kiaAirport.getRunway());

        System.out.println("-------------------------------------");

        WeatherReport weatherReport =
                applicationContext.getBean(WeatherReport.class);
        System.out.println(weatherReport);
        System.out.println(weatherReport.getSatellite());

        System.out.println("-------------------------------------");

        Shop shop = applicationContext.getBean(Shop.class);
        System.out.println(shop);
        System.out.println(shop.getOwner());

        System.out.println("-------------------------------------");

        SpaceMission spaceMission =
                applicationContext.getBean(SpaceMission.class);
        System.out.println(spaceMission);
        System.out.println(spaceMission.getRocket());

        System.out.println("-------------------------------------");

        Dam dam = applicationContext.getBean(Dam.class);
        System.out.println(dam);
        System.out.println(dam.getGate());

        System.out.println("-------------------------------------");

        System.out.println("-------------------------------------");

        AirportSecurity airportSecurity = applicationContext.getBean(AirportSecurity.class);
        System.out.println(airportSecurity);
        System.out.println(airportSecurity.getScanner());

        System.out.println("-------------------------------------");

        Amazon amazon = applicationContext.getBean(Amazon.class);
        System.out.println(amazon);
        System.out.println(amazon.getProduct());

        System.out.println("-------------------------------------");

        Apartment apartment = applicationContext.getBean(Apartment.class);
        System.out.println(apartment);
        System.out.println(apartment.getSecurity());

        System.out.println("-------------------------------------");

        Atm atm = applicationContext.getBean(Atm.class);
        System.out.println(atm);
        System.out.println(atm.getCash());

        System.out.println("-------------------------------------");

        BankLocker bankLocker = applicationContext.getBean(BankLocker.class);
        System.out.println(bankLocker);
        System.out.println(bankLocker.getAssests());

        System.out.println("-------------------------------------");

        CourtCase courtCase = applicationContext.getBean(CourtCase.class);
        System.out.println(courtCase);
        System.out.println(courtCase.getLawyer());

        System.out.println("-------------------------------------");

        DataCenter dataCenter = applicationContext.getBean(DataCenter.class);
        System.out.println(dataCenter);
        System.out.println(dataCenter.getServer());

        System.out.println("-------------------------------------");

        Movie movie = applicationContext.getBean(Movie.class);
        System.out.println(movie);
        System.out.println(movie.getDirector());

        System.out.println("-------------------------------------");

        Election election = applicationContext.getBean(Election.class);
        System.out.println(election);
        System.out.println(election.getVotingMachine());

        System.out.println("-------------------------------------");

        Factory factory = applicationContext.getBean(Factory.class);
        System.out.println(factory);
        System.out.println(factory.getMachine());

        System.out.println("-------------------------------------");

        FireStation fireStation = applicationContext.getBean(FireStation.class);
        System.out.println(fireStation);
        System.out.println(fireStation.getFireEngine());

        System.out.println("-------------------------------------");

        Gym gym = applicationContext.getBean(Gym.class);
        System.out.println(gym);
        System.out.println(gym.getTrainer());

        System.out.println("-------------------------------------");






        System.out.println("Main Ended");

    }
}
