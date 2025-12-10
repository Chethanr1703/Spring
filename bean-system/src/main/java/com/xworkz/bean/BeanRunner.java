package com.xworkz.bean;

import com.xworkz.bean.configure.CoreConfigure;
import com.xworkz.bean.dto.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class BeanRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(CoreConfigure.class);


        List<UserDTO> user =applicationContext.getBean("getUser", List.class);
        user.stream().forEach(System.out::println);
        System.out.println("===========================");


        List<FanDTO> fan = applicationContext.getBean("getFanInfo",List.class);
        fan.stream().forEach(System.out::println);

        System.out.println("===========================");
        List<StudentDTO> student = applicationContext.getBean("getStudentInfo",List.class);
        student.stream().forEach(System.out::println);
        System.out.println("===========================");

        List<ProductDTO> product = applicationContext.getBean("getProductInfo",List.class);
        product.stream().forEach(System.out::println);

        System.out.println("===========================");

        List<EmployeeDTO> employee = applicationContext.getBean("getEmployeInfo", List.class);
        employee.stream().forEach(System.out::println);

        System.out.println("====================== BAG ======================");
        List<BagDTO> bag = applicationContext.getBean("getBagInfo", List.class);
        bag.stream().forEach(System.out::println);

        System.out.println("====================== BOOK ======================");
        List<BookDTO> book = applicationContext.getBean("getBookInfo", List.class);
        book.stream().forEach(System.out::println);

        System.out.println("====================== LAPTOP ======================");
        List<LaptopDTO> laptop = applicationContext.getBean("getLaptopInfo", List.class);
        laptop.stream().forEach(System.out::println);

        System.out.println("====================== CAR ======================");
        List<CarDTO> car = applicationContext.getBean("getCarInfo", List.class);
        car.stream().forEach(System.out::println);

        System.out.println("====================== MOBILE ======================");
        List<MobileDTO> mobile = applicationContext.getBean("getMobileInfo", List.class);
        mobile.stream().forEach(System.out::println);

        System.out.println("====================== TV ======================");
        List<TVDTO> tv = applicationContext.getBean("getTvInfo", List.class);
        tv.stream().forEach(System.out::println);

        System.out.println("====================== WATCH ======================");
        List<WatchDTO> watch = applicationContext.getBean("getWatchInfo", List.class);
        watch.stream().forEach(System.out::println);

        System.out.println("====================== SHOES ======================");
        List<ShoesDTO> shoes = applicationContext.getBean("getShoesInfo", List.class);
        shoes.stream().forEach(System.out::println);

        System.out.println("====================== HOTEL ======================");
        List<HotelDTO> hotel = applicationContext.getBean("getHotelInfo", List.class);
        hotel.stream().forEach(System.out::println);

        System.out.println("====================== ROOM ======================");
        List<RoomDTO> room = applicationContext.getBean("getRoomInfo", List.class);
        room.stream().forEach(System.out::println);

        System.out.println("====================== FOOD ======================");
        List<FoodDTO> food = applicationContext.getBean("getFoodInfo", List.class);
        food.stream().forEach(System.out::println);

        System.out.println("====================== RESTAURANT ======================");
        List<RestaurantDTO> restaurant = applicationContext.getBean("getRestaurantInfo", List.class);
        restaurant.stream().forEach(System.out::println);

        System.out.println("====================== COURSE ======================");
        List<CourseDTO> course = applicationContext.getBean("getCourseInfo", List.class);
        course.stream().forEach(System.out::println);

        System.out.println("====================== BIKE ======================");
        List<BikeDTO> bike = applicationContext.getBean("getBikeInfo", List.class);
        bike.stream().forEach(System.out::println);

        System.out.println("====================== MOVIE ======================");
        List<MovieDTO> movie = applicationContext.getBean("getMovieInfo", List.class);
        movie.stream().forEach(System.out::println);

        System.out.println("====================== TICKET ======================");
        List<TicketDTO> ticket = applicationContext.getBean("getTicketInfo", List.class);
        ticket.stream().forEach(System.out::println);

        System.out.println("====================== HOSPITAL ======================");
        List<HospitalDTO> hospital = applicationContext.getBean("getHospitalInfo", List.class);
        hospital.stream().forEach(System.out::println);

        System.out.println("====================== FLIGHT ======================");
        List<FlightDTO> flight = applicationContext.getBean("getFlightInfo", List.class);
        flight.stream().forEach(System.out::println);

        System.out.println("====================== DOCTOR ======================");
        List<DoctorDTO> doctor = applicationContext.getBean("getDoctorInfo", List.class);
        doctor.stream().forEach(System.out::println);


        System.out.println("====================== PATIENT ======================");
        List<PatientDTO> patient = applicationContext.getBean("getPatientInfo", List.class);
        patient.stream().forEach(System.out::println);


        System.out.println("====================== TRAINER ======================");
        List<TrainerDTO> trainer = applicationContext.getBean("getTrainerInfo", List.class);
        trainer.stream().forEach(System.out::println);


        System.out.println("====================== GYM ======================");
        List<GymDTO> gym = applicationContext.getBean("getGymInfo", List.class);
        gym.stream().forEach(System.out::println);


        System.out.println("====================== COMPANY ======================");
        List<CompanyDTO> company = applicationContext.getBean("getCompanyInfo", List.class);
        company.stream().forEach(System.out::println);


        System.out.println("====================== DEPARTMENT ======================");
        List<DepartmentDTO> department = applicationContext.getBean("getDepartmentInfo", List.class);
        department.stream().forEach(System.out::println);


        System.out.println("====================== BANK ======================");
        List<BankDTO> bank = applicationContext.getBean("getBankInfo", List.class);
        bank.stream().forEach(System.out::println);


        System.out.println("====================== ACCOUNT ======================");
        List<AccountDTO> account = applicationContext.getBean("getAccountInfo", List.class);
        account.stream().forEach(System.out::println);


        System.out.println("====================== INSURANCE ======================");
        List<InsuranceDTO> insurance = applicationContext.getBean("getInsuranceInfo", List.class);
        insurance.stream().forEach(System.out::println);


        System.out.println("====================== POLICY ======================");
        List<PolicyDTO> policy = applicationContext.getBean("getPolicyInfo", List.class);
        policy.stream().forEach(System.out::println);

    }
}
