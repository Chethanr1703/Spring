package com.xworkz.bean.configure;

import com.xworkz.bean.dto.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.bean")

public class CoreConfigure {
    public CoreConfigure(){
        System.out.println("Configure is invoked");
    }

    @Bean
    public List<UserDTO> getUser(){
        List<UserDTO> list = new ArrayList<UserDTO>();
        UserDTO userDTO1  = new UserDTO(1,"Chethan","R","chethan@gmail.com",9632027324L,22,"Male","Laggere");
        UserDTO userDTO2  = new UserDTO(2,"Rahul","Kumar","rahul@gmail.com",9876543210L,23,"Male","Yeshwanthpur");
        UserDTO userDTO3  = new UserDTO(3,"Sneha","Shetty","sneha@gmail.com",9123456789L,21,"Female","Rajajinagar");
        UserDTO userDTO4  = new UserDTO(4,"Amit","Sharma","amit@gmail.com",9988776655L,24,"Male","BTM");
        UserDTO userDTO5  = new UserDTO(5,"Priya","Patel","priya@gmail.com",8899776655L,22,"Female","Whitefield");
        UserDTO userDTO6  = new UserDTO(6,"Rohit","Verma","rohit@gmail.com",7766554433L,25,"Male","Electronic City");
        UserDTO userDTO7  = new UserDTO(7,"Neha","Singh","neha@gmail.com",6655443322L,23,"Female","Hebbal");
        UserDTO userDTO8  = new UserDTO(8,"Arjun","Nair","arjun@gmail.com",9543216789L,22,"Male","Indiranagar");
        UserDTO userDTO9  = new UserDTO(9,"Divya","M","divya@gmail.com",9871234560L,21,"Female","Jayanagar");
        UserDTO userDTO10 = new UserDTO(10,"Kiran","Rao","kiran@gmail.com",9012345678L,24,"Male","Malleshwaram");
        UserDTO userDTO11 = new UserDTO(11,"Pooja","Iyer","pooja@gmail.com",9123987654L,22,"Female","Basavanagudi");
        UserDTO userDTO12 = new UserDTO(12,"Manoj","K","manoj@gmail.com",9812345670L,26,"Male","KR Puram");
        UserDTO userDTO13 = new UserDTO(13,"Anjali","B","anjali@gmail.com",9786543210L,23,"Female","HSR Layout");
        UserDTO userDTO14 = new UserDTO(14,"Suresh","Naik","suresh@gmail.com",9665544332L,27,"Male","Yelahanka");
        UserDTO userDTO15 = new UserDTO(15,"Kavya","S","kavya@gmail.com",9554433221L,21,"Female","Banashankari");


        list.add(userDTO1);
        list.add(userDTO2);
        list.add(userDTO3);
        list.add(userDTO4);
        list.add(userDTO5);
        list.add(userDTO6);
        list.add(userDTO7);
        list.add(userDTO8);
        list.add(userDTO9);
        list.add(userDTO10);
        list.add(userDTO11);
        list.add(userDTO12);
        list.add(userDTO13);
        list.add(userDTO14);
        list.add(userDTO15);

        return list;
    }
    @Bean

    public List<FanDTO> getFanInfo(){
        List<FanDTO> list1 = new LinkedList<>();
        FanDTO fanDTO1  = new FanDTO(1,"USHA","789ASD123",3000.0,"White",3,"2years",true);
        FanDTO fanDTO2  = new FanDTO(2,"Bajaj","456QWE234",2800.0,"Brown",5,"3years",true);
        FanDTO fanDTO3  = new FanDTO(3,"Crompton","123ZXC345",3200.0,"Black",3,"2years",true);
        FanDTO fanDTO4  = new FanDTO(4,"Orient","963RTY456",3500.0,"Grey",5,"4years",true);
        FanDTO fanDTO5  = new FanDTO(5,"Havells","741UIO567",4000.0,"White",3,"3years",true);
        FanDTO fanDTO6  = new FanDTO(6,"Philips","852PAS678",4500.0,"Silver",5,"5years",true);
        FanDTO fanDTO7  = new FanDTO(7,"V-Guard","159FGH789",3700.0,"Blue",3,"3years",true);
        FanDTO fanDTO8  = new FanDTO(8,"Syska","357JKL890",2900.0,"White",3,"2years",true);
        FanDTO fanDTO9  = new FanDTO(9,"Anchor","951BNM901",3100.0,"Black",3,"2years",true);
        FanDTO fanDTO10 = new FanDTO(10,"Usha","852QAZ012",3400.0,"Brown",5,"4years",true);
        FanDTO fanDTO11 = new FanDTO(11,"Panasonic","753WSX123",4200.0,"Silver",5,"5years",true);
        FanDTO fanDTO12 = new FanDTO(12,"Koryo","456EDC234",2600.0,"White",3,"1year",true);
        FanDTO fanDTO13 = new FanDTO(13,"Voltas","159RFV345",3900.0,"Grey",5,"4years",true);
        FanDTO fanDTO14 = new FanDTO(14,"Onida","753TGB456",2750.0,"Blue",3,"2years",true);
        FanDTO fanDTO15 = new FanDTO(15,"Godrej","951YHN567",3600.0,"Maroon",5,"3years",true);
        list1.add(fanDTO1);
        list1.add(fanDTO2);
        list1.add(fanDTO3);
        list1.add(fanDTO4);
        list1.add(fanDTO5);
        list1.add(fanDTO6);
        list1.add(fanDTO7);
        list1.add(fanDTO8);
        list1.add(fanDTO9);
        list1.add(fanDTO10);
        list1.add(fanDTO11);
        list1.add(fanDTO12);
        list1.add(fanDTO13);
        list1.add(fanDTO14);
        list1.add(fanDTO15);

        return list1;

    }
    @Bean
    public List<EmployeeDTO> getEmployeInfo(){
        List<EmployeeDTO> list = new  ArrayList<>();
        EmployeeDTO employeeDTO1  = new EmployeeDTO(1,"Chethan","Development","Trainee",35000.0,9632027324L,"chethan@gmail.com","Bangalore");
        EmployeeDTO employeeDTO2  = new EmployeeDTO(2,"Rahul","Testing","Junior QA",32000.0,9876543210L,"rahul@gmail.com","Mysore");
        EmployeeDTO employeeDTO3  = new EmployeeDTO(3,"Anita","HR","HR Executive",40000.0,9123456789L,"anita@gmail.com","Mumbai");
        EmployeeDTO employeeDTO4  = new EmployeeDTO(4,"Suresh","Finance","Accountant",45000.0,9988776655L,"suresh@gmail.com","Delhi");
        EmployeeDTO employeeDTO5  = new EmployeeDTO(5,"Priya","Development","Software Engineer",60000.0,9012345678L,"priya@gmail.com","Chennai");
        EmployeeDTO employeeDTO6  = new EmployeeDTO(6,"Rohan","Support","Technical Support",30000.0,9090909090L,"rohan@gmail.com","Hyderabad");
        EmployeeDTO employeeDTO7  =  new EmployeeDTO(7,"Kavya","Testing","Automation Tester",50000.0,9191919191L,"kavya@gmail.com","Pune");
        EmployeeDTO employeeDTO8  = new EmployeeDTO(8,"Amit","Sales","Sales Executive",38000.0,9292929292L,"amit@gmail.com","Kolkata");
        EmployeeDTO employeeDTO9  = new EmployeeDTO(9,"Neha","Marketing","Digital Marketer",42000.0,9393939393L,"neha@gmail.com","Noida");
        EmployeeDTO employeeDTO10 = new EmployeeDTO(10,"Arjun","Development","Senior Developer",90000.0,9494949494L,"arjun@gmail.com","Bangalore");
        EmployeeDTO employeeDTO11 = new EmployeeDTO(11,"Divya","HR","Recruiter",37000.0,9595959595L,"divya@gmail.com","Coimbatore");
        EmployeeDTO employeeDTO12 = new EmployeeDTO(12,"Vikram","Admin","Office Admin",28000.0,9696969696L,"vikram@gmail.com","Hubli");
        EmployeeDTO employeeDTO13 = new EmployeeDTO(13,"Pooja","Finance","Financial Analyst",65000.0,9797979797L,"pooja@gmail.com","Ahmedabad");
        EmployeeDTO employeeDTO14 = new EmployeeDTO(14,"Manoj","Support","System Engineer",52000.0,9898989898L,"manoj@gmail.com","Trivandrum");
        EmployeeDTO employeeDTO15 = new EmployeeDTO(15,"Sneha","Development","UI Developer",58000.0,9999999999L,"sneha@gmail.com","Udupi");

        list.add(employeeDTO1);
        list.add(employeeDTO2);
        list.add(employeeDTO3);
        list.add(employeeDTO4);
        list.add(employeeDTO5);
        list.add(employeeDTO6);
        list.add(employeeDTO7);
        list.add(employeeDTO8);
        list.add(employeeDTO9);
        list.add(employeeDTO10);
        list.add(employeeDTO11);
        list.add(employeeDTO12);
        list.add(employeeDTO13);
        list.add(employeeDTO14);
        list.add(employeeDTO15);
        return list;

    }

    @Bean
    public List<ProductDTO> getProductInfo(){
        List<ProductDTO> list = new ArrayList<>();
        ProductDTO productDTO1  = new ProductDTO(1,"TV","LG","Electronic",35000.0,2,"Black",true);
        ProductDTO productDTO2  = new ProductDTO(2,"Mobile","Samsung","Electronic",25000.0,1,"Blue",true);
        ProductDTO productDTO3  = new ProductDTO(3,"Laptop","Dell","Electronic",65000.0,1,"Silver",true);
        ProductDTO productDTO4  = new ProductDTO(4,"Refrigerator","Whirlpool","Electronic",40000.0,1,"White",true);
        ProductDTO productDTO5  = new ProductDTO(5,"Washing Machine","IFB","Electronic",32000.0,1,"Grey",true);
        ProductDTO productDTO6  = new ProductDTO(6,"Fan","Usha","Electronic",3500.0,3,"Brown",true);
        ProductDTO productDTO7  = new ProductDTO(7,"Mixer","Prestige","Electronic",5500.0,1,"Red",true);
        ProductDTO productDTO8  = new ProductDTO(8,"AC","Voltas","Electronic",45000.0,1,"White",true);
        ProductDTO productDTO9  = new ProductDTO(9,"Iron Box","Philips","Electronic",1800.0,2,"Black",true);
        ProductDTO productDTO10 = new ProductDTO(10,"Speaker","JBL","Electronic",7000.0,1,"Black",true);
        ProductDTO productDTO11 = new ProductDTO(11,"Headphones","Boat","Electronic",2500.0,1,"Blue",true);
        ProductDTO productDTO12 = new ProductDTO(12,"Camera","Canon","Electronic",55000.0,1,"Black",true);
        ProductDTO productDTO13 = new ProductDTO(13,"Printer","HP","Electronic",15000.0,1,"White",true);
        ProductDTO productDTO14 = new ProductDTO(14,"Tablet","Lenovo","Electronic",22000.0,1,"Grey",true);
        ProductDTO productDTO15 = new ProductDTO(15,"Smart Watch","Noise","Electronic",5000.0,1,"Black",true);


        list.add(productDTO1);
        list.add(productDTO2);
        list.add(productDTO3);
        list.add(productDTO4);
        list.add(productDTO5);
        list.add(productDTO6);
        list.add(productDTO7);
        list.add(productDTO8);
        list.add(productDTO9);
        list.add(productDTO10);
        list.add(productDTO11);
        list.add(productDTO12);
        list.add(productDTO13);
        list.add(productDTO14);
        list.add(productDTO15);

        return list;

    }

    @Bean
    public List<StudentDTO> getStudentInfo() {
        List<StudentDTO> list = new ArrayList<>();
        StudentDTO student1  = new StudentDTO(1,"Chethan","Java","BMS College",22,85.5,9632027324L,"Bangalore");
        StudentDTO student2  = new StudentDTO(2,"Rahul","Python","SJCE",23,78.0,9876543210L,"Mysore");
        StudentDTO student3  = new StudentDTO(3,"Anita","Data Science","VTU",22,88.4,9123456789L,"Belgaum");
        StudentDTO student4  = new StudentDTO(4,"Suresh","Mechanical","NITK",24,72.3,9988776655L,"Surathkal");
        StudentDTO student5  = new StudentDTO(5,"Priya","CSE","PES University",21,91.2,9012345678L,"Bangalore");
        StudentDTO student6  = new StudentDTO(6,"Rohan","EEE","RV College",23,76.9,9090909090L,"Mandya");
        StudentDTO student7  = new StudentDTO(7,"Kavya","MBA","Christ University",22,89.5,9191919191L,"Bangalore");
        StudentDTO student8  = new StudentDTO(8,"Amit","Civil","UVCE",24,70.0,9292929292L,"Tumkur");
        StudentDTO student9  = new StudentDTO(9,"Neha","BCA","Jain University",21,83.4,9393939393L,"Bangalore");
        StudentDTO student10 = new StudentDTO(10,"Arjun","AI","MIT",23,94.1,9494949494L,"Manipal");
        StudentDTO student11 = new StudentDTO(11,"Divya","MCA","NMAMIT",22,86.7,9595959595L,"Udupi");
        StudentDTO student12 = new StudentDTO(12,"Vikram","Physics","St Joseph's",24,69.8,9696969696L,"Shimoga");
        StudentDTO student13 = new StudentDTO(13,"Pooja","Chemistry","MES College",21,88.9,9797979797L,"Mangalore");
        StudentDTO student14 = new StudentDTO(14,"Manoj","Electronics","Dayananda Sagar",23,75.6,9898989898L,"Bangalore");
        StudentDTO student15 = new StudentDTO(15,"Sneha","Statistics","Mount Carmel",22,90.3,9999999999L,"Bangalore");


        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);
        list.add(student12);
        list.add(student13);
        list.add(student14);
        list.add(student15);

        return list;

    }
    @Bean
    public List<BagDTO> getBagInfo(){
        List<BagDTO> list = new ArrayList<>();

        BagDTO b1  = new BagDTO(1,"Skybags","School Bag","Blue",1200.0,25,true,"Nylon");
        BagDTO b2  = new BagDTO(2,"Puma","Laptop Bag","Black",2500.0,30,true,"Polyester");
        BagDTO b3  = new BagDTO(3,"Adidas","College Bag","Grey",2200.0,28,true,"Canvas");
        BagDTO b4  = new BagDTO(4,"American Tourister","Travel Bag","Red",3500.0,50,true,"Polyester");
        BagDTO b5  = new BagDTO(5,"Wildcraft","Trekking Bag","Green",4200.0,60,true,"Nylon");
        BagDTO b6  = new BagDTO(6,"HRX","Gym Bag","Black",1800.0,20,true,"Polyester");
        BagDTO b7  = new BagDTO(7,"Nike","Sports Bag","Blue",3000.0,35,true,"Synthetic");
        BagDTO b8  = new BagDTO(8,"Fastrack","Hand Bag","Pink",2100.0,15,true,"Leather");
        BagDTO b9  = new BagDTO(9,"Lavie","Women Bag","Brown",2700.0,18,true,"Leather");
        BagDTO b10 = new BagDTO(10,"Dell","Laptop Bag","Black",2600.0,25,true,"Polyester");
        BagDTO b11 = new BagDTO(11,"HP","Office Bag","Grey",2400.0,22,true,"Polyester");
        BagDTO b12 = new BagDTO(12,"Lenovo","Laptop Backpack","Blue",2800.0,27,true,"Nylon");
        BagDTO b13 = new BagDTO(13,"Safari","Travel Backpack","Orange",3900.0,45,true,"Polyester");
        BagDTO b14 = new BagDTO(14,"Reebok","Sports Bag","Black",2900.0,32,true,"Synthetic");
        BagDTO b15 = new BagDTO(15,"Woodland","Trekking Bag","Brown",4600.0,65,true,"Canvas");

        list.add(b1); list.add(b2); list.add(b3); list.add(b4); list.add(b5);
        list.add(b6); list.add(b7); list.add(b8); list.add(b9); list.add(b10);
        list.add(b11); list.add(b12); list.add(b13); list.add(b14); list.add(b15);

        return list;
    }

    @Bean
    public List<BookDTO> getBookInfo() {
        List<BookDTO> list = new ArrayList<>();

        BookDTO book1  = new BookDTO(1,"Java Basics","James","Programming",450.0,"Pearson",350,true);
        BookDTO book2  = new BookDTO(2,"Python Guide","Mark","Programming",550.0,"OReilly",420,true);
        BookDTO book3  = new BookDTO(3,"Data Structures","Narasimha","CS",600.0,"McGraw",500,true);
        BookDTO book4  = new BookDTO(4,"DBMS","Korth","Database",700.0,"TMH",480,true);
        BookDTO book5  = new BookDTO(5,"Operating System","Galvin","CS",750.0,"Wiley",600,true);
        BookDTO book6  = new BookDTO(6,"Computer Networks","Tanenbaum","CS",680.0,"Pearson",520,true);
        BookDTO book7  = new BookDTO(7,"Software Engineering","Pressman","IT",650.0,"McGraw",470,true);
        BookDTO book8  = new BookDTO(8,"AI Basics","Stuart","AI",720.0,"Pearson",540,true);
        BookDTO book9  = new BookDTO(9,"Machine Learning","Tom","AI",820.0,"OReilly",610,true);
        BookDTO book10 = new BookDTO(10,"Cyber Security","Raj","Security",560.0,"TMH",390,true);
        BookDTO book11 = new BookDTO(11,"Spring Boot","Josh","Programming",880.0,"Apress",460,true);
        BookDTO book12 = new BookDTO(12,"Hibernate","Gavin","Programming",620.0,"Wiley",430,true);
        BookDTO book13 = new BookDTO(13,"Web Development","John","Web",580.0,"Pearson",410,true);
        BookDTO book14 = new BookDTO(14,"Cloud Computing","Amazon","Cloud",900.0,"TMH",520,true);
        BookDTO book15 = new BookDTO(15,"DevOps","Kubernetes","DevOps",950.0,"OReilly",490,true);

        list.add(book1); list.add(book2); list.add(book3); list.add(book4); list.add(book5);
        list.add(book6); list.add(book7); list.add(book8); list.add(book9); list.add(book10);
        list.add(book11); list.add(book12); list.add(book13); list.add(book14); list.add(book15);

        return list;
    }

    @Bean
    public List<LaptopDTO> getLaptopInfo() {
        List<LaptopDTO> list = new ArrayList<>();

        LaptopDTO l1  = new LaptopDTO(1,"Dell","Inspiron",55000.0,"i5",8,512,true);
        LaptopDTO l2  = new LaptopDTO(2,"HP","Pavilion",60000.0,"i5",16,512,true);
        LaptopDTO l3  = new LaptopDTO(3,"Lenovo","ThinkPad",70000.0,"i7",16,1024,true);
        LaptopDTO l4  = new LaptopDTO(4,"Apple","MacBook Air",95000.0,"M1",8,256,true);
        LaptopDTO l5  = new LaptopDTO(5,"Apple","MacBook Pro",135000.0,"M2",16,512,true);
        LaptopDTO l6  = new LaptopDTO(6,"Asus","Vivobook",48000.0,"i3",8,256,true);
        LaptopDTO l7  = new LaptopDTO(7,"Acer","Aspire",52000.0,"i5",8,512,true);
        LaptopDTO l8  = new LaptopDTO(8,"MSI","Gaming",98000.0,"i7",16,1024,true);
        LaptopDTO l9  = new LaptopDTO(9,"Samsung","Galaxy Book",65000.0,"i5",8,512,true);
        LaptopDTO l10 = new LaptopDTO(10,"Microsoft","Surface",110000.0,"i7",16,512,true);
        LaptopDTO l11 = new LaptopDTO(11,"Realme","Book Slim",46000.0,"i3",8,256,true);
        LaptopDTO l12 = new LaptopDTO(12,"Infinix","X1",42000.0,"i3",8,256,true);
        LaptopDTO l13 = new LaptopDTO(13,"HP","EliteBook",88000.0,"i7",16,1024,true);
        LaptopDTO l14 = new LaptopDTO(14,"Dell","XPS",125000.0,"i9",32,1024,true);
        LaptopDTO l15 = new LaptopDTO(15,"Asus","ROG",145000.0,"i9",32,1024,true);

        list.add(l1); list.add(l2); list.add(l3); list.add(l4); list.add(l5);
        list.add(l6); list.add(l7); list.add(l8); list.add(l9); list.add(l10);
        list.add(l11); list.add(l12); list.add(l13); list.add(l14); list.add(l15);

        return list;
    }


    @Bean
    public List<CarDTO> getCarInfo() {
        List<CarDTO> list = new ArrayList<>();

        CarDTO car1  = new CarDTO(1,"Hyundai","i20","White",900000.0,"Petrol",5,true);
        CarDTO car2  = new CarDTO(2,"Maruti","Swift","Red",800000.0,"Petrol",5,true);
        CarDTO car3  = new CarDTO(3,"Tata","Nexon","Blue",1200000.0,"Diesel",5,true);
        CarDTO car4  = new CarDTO(4,"Kia","Seltos","Black",1500000.0,"Petrol",5,true);
        CarDTO car5  = new CarDTO(5,"Mahindra","Thar","Green",1800000.0,"Diesel",4,true);
        CarDTO car6  = new CarDTO(6,"Toyota","Innova","Silver",2200000.0,"Diesel",7,true);
        CarDTO car7  = new CarDTO(7,"Honda","City","Grey",1400000.0,"Petrol",5,true);
        CarDTO car8  = new CarDTO(8,"Skoda","Rapid","White",1300000.0,"Petrol",5,true);
        CarDTO car9  = new CarDTO(9,"Volkswagen","Polo","Blue",950000.0,"Petrol",5,true);
        CarDTO car10 = new CarDTO(10,"Renault","Kwid","Orange",550000.0,"Petrol",5,true);
        CarDTO car11 = new CarDTO(11,"MG","Hector","Red",1700000.0,"Petrol",5,true);
        CarDTO car12 = new CarDTO(12,"Nissan","Magnite","Brown",1000000.0,"Petrol",5,true);
        CarDTO car13 = new CarDTO(13,"Hyundai","Creta","White",1600000.0,"Diesel",5,true);
        CarDTO car14 = new CarDTO(14,"Maruti","Baleno","Blue",950000.0,"Petrol",5,true);
        CarDTO car15 = new CarDTO(15,"Tata","Harrier","Grey",1900000.0,"Diesel",5,true);

        list.add(car1);  list.add(car2);  list.add(car3);  list.add(car4);  list.add(car5);
        list.add(car6);  list.add(car7);  list.add(car8);  list.add(car9);  list.add(car10);
        list.add(car11); list.add(car12); list.add(car13); list.add(car14); list.add(car15);

        return list;
    }

    @Bean
    public List<MobileDTO> getMobileInfo() {
        List<MobileDTO> list = new ArrayList<>();

        MobileDTO m1  = new MobileDTO(1,"Samsung","Galaxy S21",55000.0,8,128,"Android",true);
        MobileDTO m2  = new MobileDTO(2,"Apple","iPhone 14",80000.0,6,128,"iOS",true);
        MobileDTO m3  = new MobileDTO(3,"OnePlus","11R",45000.0,8,256,"Android",true);
        MobileDTO m4  = new MobileDTO(4,"Realme","Narzo 60",20000.0,6,128,"Android",true);
        MobileDTO m5  = new MobileDTO(5,"Redmi","Note 13",19000.0,6,128,"Android",true);
        MobileDTO m6  = new MobileDTO(6,"Poco","X6",23000.0,8,256,"Android",true);
        MobileDTO m7  = new MobileDTO(7,"Vivo","V29",32000.0,8,256,"Android",true);
        MobileDTO m8  = new MobileDTO(8,"Oppo","Reno 10",35000.0,8,256,"Android",true);
        MobileDTO m9  = new MobileDTO(9,"Nothing","Phone 2",42000.0,12,256,"Android",true);
        MobileDTO m10 = new MobileDTO(10,"Motorola","Edge 40",30000.0,8,256,"Android",true);
        MobileDTO m11 = new MobileDTO(11,"Samsung","Galaxy A55",28000.0,8,128,"Android",true);
        MobileDTO m12 = new MobileDTO(12,"Apple","iPhone 13",65000.0,4,128,"iOS",true);
        MobileDTO m13 = new MobileDTO(13,"IQOO","Neo 7",32000.0,8,256,"Android",true);
        MobileDTO m14 = new MobileDTO(14,"Realme","11 Pro",27000.0,8,256,"Android",true);
        MobileDTO m15 = new MobileDTO(15,"Redmi","12C",12000.0,4,64,"Android",true);

        list.add(m1);  list.add(m2);  list.add(m3);  list.add(m4);  list.add(m5);
        list.add(m6);  list.add(m7);  list.add(m8);  list.add(m9);  list.add(m10);
        list.add(m11); list.add(m12); list.add(m13); list.add(m14); list.add(m15);

        return list;
    }

    @Bean
    public List<TVDTO> getTvInfo() {
        List<TVDTO> list = new ArrayList<>();

        TVDTO tv1  = new TVDTO(1,"LG",32,"LED",18000.0,"HD",true,true);
        TVDTO tv2  = new TVDTO(2,"Samsung",43,"LED",32000.0,"Full HD",true,true);
        TVDTO tv3  = new TVDTO(3,"Sony",55,"OLED",85000.0,"4K",true,true);
        TVDTO tv4  = new TVDTO(4,"TCL",40,"LED",22000.0,"Full HD",true,true);
        TVDTO tv5  = new TVDTO(5,"Mi",43,"LED",26000.0,"Full HD",true,true);
        TVDTO tv6  = new TVDTO(6,"OnePlus",50,"QLED",48000.0,"4K",true,true);
        TVDTO tv7  = new TVDTO(7,"Vu",55,"LED",38000.0,"4K",true,true);
        TVDTO tv8  = new TVDTO(8,"Realme",32,"LED",16000.0,"HD",true,true);
        TVDTO tv9  = new TVDTO(9,"Panasonic",49,"LED",34000.0,"Full HD",true,true);
        TVDTO tv10 = new TVDTO(10,"LG",65,"OLED",120000.0,"4K",true,true);
        TVDTO tv11 = new TVDTO(11,"Samsung",32,"LED",19000.0,"HD",true,true);
        TVDTO tv12 = new TVDTO(12,"Sony",43,"LED",40000.0,"Full HD",true,true);
        TVDTO tv13 = new TVDTO(13,"TCL",55,"QLED",52000.0,"4K",true,true);
        TVDTO tv14 = new TVDTO(14,"Mi",65,"LED",58000.0,"4K",true,true);
        TVDTO tv15 = new TVDTO(15,"Vu",75,"LED",78000.0,"4K",true,true);

        list.add(tv1);  list.add(tv2);  list.add(tv3);  list.add(tv4);  list.add(tv5);
        list.add(tv6);  list.add(tv7);  list.add(tv8);  list.add(tv9);  list.add(tv10);
        list.add(tv11); list.add(tv12); list.add(tv13); list.add(tv14); list.add(tv15);

        return list;
    }

    @Bean
    public List<WatchDTO> getWatchInfo() {
        List<WatchDTO> list = new ArrayList<>();

        WatchDTO w1  = new WatchDTO(1,"Fastrack","Analog","Black",1500.0,true,"Leather",false);
        WatchDTO w2  = new WatchDTO(2,"Titan","Analog","Brown",2500.0,true,"Leather",false);
        WatchDTO w3  = new WatchDTO(3,"Sonata","Analog","Gold",1200.0,false,"Metal",false);
        WatchDTO w4  = new WatchDTO(4,"Casio","Digital","Black",2200.0,true,"Resin",true);
        WatchDTO w5  = new WatchDTO(5,"Apple","Smart","White",32000.0,true,"Silicone",true);
        WatchDTO w6  = new WatchDTO(6,"Noise","Smart","Black",3500.0,true,"Silicone",true);
        WatchDTO w7  = new WatchDTO(7,"Boat","Smart","Blue",2800.0,true,"Silicone",true);
        WatchDTO w8  = new WatchDTO(8,"Fire-Boltt","Smart","Grey",2600.0,true,"Silicone",true);
        WatchDTO w9  = new WatchDTO(9,"Fossil","Analog","Silver",8000.0,true,"Metal",false);
        WatchDTO w10 = new WatchDTO(10,"Timex","Analog","Black",1800.0,true,"Leather",false);
        WatchDTO w11 = new WatchDTO(11,"Casio","Digital","Blue",2300.0,true,"Resin",true);
        WatchDTO w12 = new WatchDTO(12,"Samsung","Smart","Black",25000.0,true,"Silicone",true);
        WatchDTO w13 = new WatchDTO(13,"Mi","Smart","Green",2200.0,true,"Silicone",true);
        WatchDTO w14 = new WatchDTO(14,"Fastrack","Digital","Red",2000.0,true,"Resin",true);
        WatchDTO w15 = new WatchDTO(15,"Titan","Analog","Blue",2700.0,true,"Leather",false);

        list.add(w1);  list.add(w2);  list.add(w3);  list.add(w4);  list.add(w5);
        list.add(w6);  list.add(w7);  list.add(w8);  list.add(w9);  list.add(w10);
        list.add(w11); list.add(w12); list.add(w13); list.add(w14); list.add(w15);

        return list;
    }

    @Bean
    public List<ShoesDTO> getShoesInfo() {
        List<ShoesDTO> list = new ArrayList<>();

        ShoesDTO s1  = new ShoesDTO(1,"Nike","Running",8,"Black",4500.0,"Male",true);
        ShoesDTO s2  = new ShoesDTO(2,"Adidas","Running",9,"Blue",4200.0,"Male",true);
        ShoesDTO s3  = new ShoesDTO(3,"Puma","Sports",7,"White",3800.0,"Female",true);
        ShoesDTO s4  = new ShoesDTO(4,"Reebok","Casual",8,"Grey",3200.0,"Male",true);
        ShoesDTO s5  = new ShoesDTO(5,"Woodland","Trekking",9,"Brown",5000.0,"Male",true);
        ShoesDTO s6  = new ShoesDTO(6,"Bata","Formal",8,"Black",2200.0,"Male",true);
        ShoesDTO s7  = new ShoesDTO(7,"Skechers","Casual",7,"Pink",4000.0,"Female",true);
        ShoesDTO s8  = new ShoesDTO(8,"Red Tape","Formal",9,"Tan",2600.0,"Male",true);
        ShoesDTO s9  = new ShoesDTO(9,"Campus","Sports",8,"Blue",1800.0,"Unisex",true);
        ShoesDTO s10 = new ShoesDTO(10,"Sparx","Casual",7,"Red",1500.0,"Unisex",true);
        ShoesDTO s11 = new ShoesDTO(11,"HRX","Running",8,"Green",2800.0,"Male",true);
        ShoesDTO s12 = new ShoesDTO(12,"Nike","Sports",6,"White",4600.0,"Female",true);
        ShoesDTO s13 = new ShoesDTO(13,"Adidas","Casual",9,"Black",3500.0,"Male",true);
        ShoesDTO s14 = new ShoesDTO(14,"Puma","Running",7,"Grey",3900.0,"Female",true);
        ShoesDTO s15 = new ShoesDTO(15,"Woodland","Casual",10,"Brown",4800.0,"Male",true);

        list.add(s1);  list.add(s2);  list.add(s3);  list.add(s4);  list.add(s5);
        list.add(s6);  list.add(s7);  list.add(s8);  list.add(s9);  list.add(s10);
        list.add(s11); list.add(s12); list.add(s13); list.add(s14); list.add(s15);

        return list;
    }
    @Bean
    public List<HotelDTO> getHotelInfo() {
        List<HotelDTO> list = new ArrayList<>();

        HotelDTO hotel1  = new HotelDTO(1,"The Leela","Bangalore","5 Star",8500.0,4.8,true,true);
        HotelDTO hotel2  = new HotelDTO(2,"Taj Vivanta","Mysore","5 Star",7500.0,4.7,true,true);
        HotelDTO hotel3  = new HotelDTO(3,"Hotel Mayura","Shimoga","3 Star",2500.0,4.0,true,false);
        HotelDTO hotel4  = new HotelDTO(4,"The Gateway","Mangalore","4 Star",4500.0,4.3,true,true);
        HotelDTO hotel5  = new HotelDTO(5,"Green Palace","Udupi","3 Star",2800.0,4.1,true,false);
        HotelDTO hotel6  = new HotelDTO(6,"Palm Resort","Goa","Resort",6000.0,4.5,true,true);
        HotelDTO hotel7  = new HotelDTO(7,"Skyline Inn","Delhi","3 Star",3200.0,3.9,true,false);
        HotelDTO hotel8  = new HotelDTO(8,"Sea View","Chennai","4 Star",5000.0,4.2,true,true);
        HotelDTO hotel9  = new HotelDTO(9,"Hill Top","Ooty","Resort",5500.0,4.4,true,true);
        HotelDTO hotel10 = new HotelDTO(10,"City Lodge","Bangalore","2 Star",1800.0,3.7,false,false);
        HotelDTO hotel11 = new HotelDTO(11,"Royal Stay","Hyderabad","4 Star",4200.0,4.0,true,true);
        HotelDTO hotel12 = new HotelDTO(12,"Comfort Inn","Pune","3 Star",2700.0,3.9,true,false);
        HotelDTO hotel13 = new HotelDTO(13,"Lake View","Kodaikanal","Resort",5800.0,4.3,true,true);
        HotelDTO hotel14 = new HotelDTO(14,"Sunrise Hotel","Hubli","3 Star",2400.0,3.8,true,false);
        HotelDTO hotel15 = new HotelDTO(15,"Metro Grand","Mumbai","4 Star",6200.0,4.1,true,true);

        list.add(hotel1); list.add(hotel2); list.add(hotel3); list.add(hotel4); list.add(hotel5);
        list.add(hotel6); list.add(hotel7); list.add(hotel8); list.add(hotel9); list.add(hotel10);
        list.add(hotel11); list.add(hotel12); list.add(hotel13); list.add(hotel14); list.add(hotel15);

        return list;
    }

    @Bean
    public List<RoomDTO> getRoomInfo() {
        List<RoomDTO> list = new ArrayList<>();

        RoomDTO room1  = new RoomDTO(1,101,"Single",1500.0,true,true,1,"Single");
        RoomDTO room2  = new RoomDTO(2,102,"Double",2000.0,true,true,1,"Double");
        RoomDTO room3  = new RoomDTO(3,103,"Suite",3500.0,true,true,1,"King");
        RoomDTO room4  = new RoomDTO(4,201,"Single",1400.0,false,true,2,"Single");
        RoomDTO room5  = new RoomDTO(5,202,"Double",1900.0,false,true,2,"Double");
        RoomDTO room6  = new RoomDTO(6,203,"Suite",3300.0,true,false,2,"Queen");
        RoomDTO room7  = new RoomDTO(7,301,"Single",1600.0,true,true,3,"Single");
        RoomDTO room8  = new RoomDTO(8,302,"Double",2100.0,true,false,3,"Double");
        RoomDTO room9  = new RoomDTO(9,303,"Suite",3600.0,true,true,3,"King");
        RoomDTO room10 = new RoomDTO(10,401,"Single",1700.0,true,true,4,"Single");
        RoomDTO room11 = new RoomDTO(11,402,"Double",2200.0,true,true,4,"Double");
        RoomDTO room12 = new RoomDTO(12,403,"Suite",3800.0,true,false,4,"Queen");
        RoomDTO room13 = new RoomDTO(13,501,"Single",1800.0,true,true,5,"Single");
        RoomDTO room14 = new RoomDTO(14,502,"Double",2300.0,true,true,5,"Double");
        RoomDTO room15 = new RoomDTO(15,503,"Suite",4000.0,true,true,5,"King");

        list.add(room1); list.add(room2); list.add(room3); list.add(room4); list.add(room5);
        list.add(room6); list.add(room7); list.add(room8); list.add(room9); list.add(room10);
        list.add(room11); list.add(room12); list.add(room13); list.add(room14); list.add(room15);

        return list;
    }

    @Bean
    public List<FoodDTO> getFoodInfo() {
        List<FoodDTO> list = new ArrayList<>();

        FoodDTO food1  = new FoodDTO(1,"Idli","Veg","Breakfast",40.0,false,"South Indian",true);
        FoodDTO food2  = new FoodDTO(2,"Masala Dosa","Veg","Breakfast",60.0,true,"South Indian",true);
        FoodDTO food3  = new FoodDTO(3,"Chicken Biryani","Non-Veg","Main Course",180.0,true,"Indian",true);
        FoodDTO food4  = new FoodDTO(4,"Veg Pulao","Veg","Main Course",120.0,false,"Indian",true);
        FoodDTO food5  = new FoodDTO(5,"Paneer Butter Masala","Veg","Main Course",160.0,false,"North Indian",true);
        FoodDTO food6  = new FoodDTO(6,"Gulab Jamun","Veg","Dessert",70.0,false,"Indian",true);
        FoodDTO food7  = new FoodDTO(7,"Ice Cream","Veg","Dessert",80.0,false,"Western",true);
        FoodDTO food8  = new FoodDTO(8,"Fried Rice","Veg","Main Course",130.0,true,"Chinese",true);
        FoodDTO food9  = new FoodDTO(9,"Chicken Manchurian","Non-Veg","Starter",150.0,true,"Chinese",true);
        FoodDTO food10 = new FoodDTO(10,"Pasta","Veg","Main Course",140.0,false,"Italian",true);
        FoodDTO food11 = new FoodDTO(11,"Garlic Bread","Veg","Starter",90.0,false,"Italian",true);
        FoodDTO food12 = new FoodDTO(12,"Fish Fry","Non-Veg","Starter",170.0,true,"Coastal",true);
        FoodDTO food13 = new FoodDTO(13,"Paratha","Veg","Breakfast",50.0,false,"North Indian",true);
        FoodDTO food14 = new FoodDTO(14,"Rasam Rice","Veg","Main Course",80.0,true,"South Indian",true);
        FoodDTO food15 = new FoodDTO(15,"Chocolate Cake","Veg","Dessert",120.0,false,"Western",true);

        list.add(food1); list.add(food2); list.add(food3); list.add(food4); list.add(food5);
        list.add(food6); list.add(food7); list.add(food8); list.add(food9); list.add(food10);
        list.add(food11); list.add(food12); list.add(food13); list.add(food14); list.add(food15);

        return list;
    }
    @Bean
    public List<RestaurantDTO> getRestaurantInfo() {
        List<RestaurantDTO> list = new ArrayList<>();

        RestaurantDTO res1  = new RestaurantDTO(1,"Udupi Upahar","Bangalore","Veg",4.3,"South Indian",true,true);
        RestaurantDTO res2  = new RestaurantDTO(2,"Empire","Bangalore","Both",4.1,"Multi-Cuisine",true,true);
        RestaurantDTO res3  = new RestaurantDTO(3,"Meghana Foods","Bangalore","Both",4.4,"Andhra",true,true);
        RestaurantDTO res4  = new RestaurantDTO(4,"Pai Tiffins","Udupi","Veg",4.2,"South Indian",false,false);
        RestaurantDTO res5  = new RestaurantDTO(5,"Barbeque Nation","Mysore","Both",4.5,"BBQ",true,true);
        RestaurantDTO res6  = new RestaurantDTO(6,"A2B","Chennai","Veg",4.0,"South Indian",true,true);
        RestaurantDTO res7  = new RestaurantDTO(7,"KFC","Bangalore","Non-Veg",4.0,"Fast Food",true,true);
        RestaurantDTO res8  = new RestaurantDTO(8,"Dominos","Mysore","Veg",4.1,"Pizza",true,true);
        RestaurantDTO res9  = new RestaurantDTO(9,"Pizza Hut","Mangalore","Both",4.0,"Pizza",true,true);
        RestaurantDTO res10 = new RestaurantDTO(10,"Hotel Janatha","Shimoga","Veg",3.9,"South Indian",false,false);
        RestaurantDTO res11 = new RestaurantDTO(11,"Mainland China","Bangalore","Both",4.3,"Chinese",true,true);
        RestaurantDTO res12 = new RestaurantDTO(12,"McDonald's","Hubli","Both",4.0,"Fast Food",true,true);
        RestaurantDTO res13 = new RestaurantDTO(13,"Punjab Grill","Delhi","Both",4.4,"North Indian",true,true);
        RestaurantDTO res14 = new RestaurantDTO(14,"Cafe Coffee Day","Tumkur","Veg",4.1,"Cafe",true,true);
        RestaurantDTO res15 = new RestaurantDTO(15,"Halli Mane","Bangalore","Veg",4.2,"South Indian",false,true);

        list.add(res1); list.add(res2); list.add(res3); list.add(res4); list.add(res5);
        list.add(res6); list.add(res7); list.add(res8); list.add(res9); list.add(res10);
        list.add(res11); list.add(res12); list.add(res13); list.add(res14); list.add(res15);

        return list;
    }
    @Bean
    public List<CourseDTO> getCourseInfo() {
        List<CourseDTO> list = new ArrayList<>();

        CourseDTO c1  = new CourseDTO(1,"Java Full Stack","Ramesh","Offline","4 Months",25000.0,"Intermediate",true);
        CourseDTO c2  = new CourseDTO(2,"Python Programming","Suresh","Online","3 Months",22000.0,"Beginner",true);
        CourseDTO c3  = new CourseDTO(3,"Data Science","Anita","Offline","6 Months",45000.0,"Advanced",true);
        CourseDTO c4  = new CourseDTO(4,"Web Development","Divya","Online","3 Months",23000.0,"Beginner",true);
        CourseDTO c5  = new CourseDTO(5,"Cloud Computing","Manoj","Offline","4 Months",30000.0,"Intermediate",true);
        CourseDTO c6  = new CourseDTO(6,"Machine Learning","Vikram","Online","5 Months",40000.0,"Advanced",true);
        CourseDTO c7  = new CourseDTO(7,"Cyber Security","Kiran","Offline","4 Months",32000.0,"Intermediate",true);
        CourseDTO c8  = new CourseDTO(8,"React & Node","Pooja","Online","3 Months",26000.0,"Intermediate",true);
        CourseDTO c9  = new CourseDTO(9,"Android Development","Rahul","Offline","4 Months",28000.0,"Beginner",true);
        CourseDTO c10 = new CourseDTO(10,"DevOps","Sneha","Online","3 Months",35000.0,"Advanced",true);
        CourseDTO c11 = new CourseDTO(11,"SQL & Databases","Kavya","Online","2 Months",18000.0,"Beginner",true);
        CourseDTO c12 = new CourseDTO(12,"AI Basics","Arjun","Offline","3 Months",27000.0,"Intermediate",true);
        CourseDTO c13 = new CourseDTO(13,"Big Data","Lokesh","Online","5 Months",42000.0,"Advanced",true);
        CourseDTO c14 = new CourseDTO(14,"Testing (Manual+Automation)","Nithya","Offline","3 Months",24000.0,"Beginner",true);
        CourseDTO c15 = new CourseDTO(15,"Django with Python","Harsha","Online","3 Months",23000.0,"Intermediate",true);

        list.add(c1);  list.add(c2);  list.add(c3);  list.add(c4);  list.add(c5);
        list.add(c6);  list.add(c7);  list.add(c8);  list.add(c9);  list.add(c10);
        list.add(c11); list.add(c12); list.add(c13); list.add(c14); list.add(c15);

        return list;
    }

    @Bean
    public List<BikeDTO> getBikeInfo() {
        List<BikeDTO> list = new ArrayList<>();

        BikeDTO bike1  = new BikeDTO(1,"Yamaha","R15",155,180000.0,"Blue","Sports",true);
        BikeDTO bike2  = new BikeDTO(2,"Honda","Unicorn",160,120000.0,"Black","Commuter",true);
        BikeDTO bike3  = new BikeDTO(3,"Bajaj","Pulsar 220",220,140000.0,"Red","Sports",true);
        BikeDTO bike4  = new BikeDTO(4,"Royal Enfield","Classic 350",350,210000.0,"Green","Cruiser",true);
        BikeDTO bike5  = new BikeDTO(5,"TVS","Apache RTR 160",160,125000.0,"White","Sports",true);
        BikeDTO bike6  = new BikeDTO(6,"KTM","Duke 200",200,220000.0,"Orange","Sports",true);
        BikeDTO bike7  = new BikeDTO(7,"Suzuki","Gixxer",155,130000.0,"Blue","Sports",true);
        BikeDTO bike8  = new BikeDTO(8,"Hero","Splendor Plus",100,85000.0,"Black","Commuter",true);
        BikeDTO bike9  = new BikeDTO(9,"Bajaj","Dominar 400",373,230000.0,"Green","Touring",true);
        BikeDTO bike10 = new BikeDTO(10,"Yamaha","FZ",150,115000.0,"Grey","Commuter",true);
        BikeDTO bike11 = new BikeDTO(11,"Honda","Shine",125,95000.0,"Red","Commuter",true);
        BikeDTO bike12 = new BikeDTO(12,"TVS","Jupiter",110,90000.0,"Silver","Scooter",true);
        BikeDTO bike13 = new BikeDTO(13,"Suzuki","Access 125",125,95000.0,"Blue","Scooter",true);
        BikeDTO bike14 = new BikeDTO(14,"Royal Enfield","Hunter 350",350,200000.0,"Black","Cruiser",true);
        BikeDTO bike15 = new BikeDTO(15,"Kawasaki","Ninja 300",300,330000.0,"Green","Sports",true);

        list.add(bike1);  list.add(bike2);  list.add(bike3);  list.add(bike4);  list.add(bike5);
        list.add(bike6);  list.add(bike7);  list.add(bike8);  list.add(bike9);  list.add(bike10);
        list.add(bike11); list.add(bike12); list.add(bike13); list.add(bike14); list.add(bike15);

        return list;
    }
    @Bean
    public List<MovieDTO> getMovieInfo() {
        List<MovieDTO> list = new ArrayList<>();

        MovieDTO movie1  = new MovieDTO(1,"KGF","Kannada","Action",8.8,156,"Prashanth Neel",true);
        MovieDTO movie2  = new MovieDTO(2,"Bahubali","Telugu","Action",9.0,167,"Rajamouli",true);
        MovieDTO movie3  = new MovieDTO(3,"3 Idiots","Hindi","Drama",9.1,160,"Rajkumar Hirani",true);
        MovieDTO movie4  = new MovieDTO(4,"Dangal","Hindi","Sports",8.9,161,"Nitesh Tiwari",true);
        MovieDTO movie5  = new MovieDTO(5,"RRR","Telugu","Action",8.7,180,"Rajamouli",true);
        MovieDTO movie6  = new MovieDTO(6,"Leo","Tamil","Action",7.8,164,"Lokesh Kanagaraj",true);
        MovieDTO movie7  = new MovieDTO(7,"Kantara","Kannada","Drama",8.5,150,"Rishab Shetty",true);
        MovieDTO movie8  = new MovieDTO(8,"Inception","English","Sci-Fi",8.8,148,"Christopher Nolan",true);
        MovieDTO movie9  = new MovieDTO(9,"Avengers: Endgame","English","Action",8.4,181,"Russo Brothers",true);
        MovieDTO movie10 = new MovieDTO(10,"Vikram","Tamil","Action",8.3,175,"Lokesh Kanagaraj",true);
        MovieDTO movie11 = new MovieDTO(11,"Kirik Party","Kannada","Rom-Com",8.3,165,"Rishab Shetty",true);
        MovieDTO movie12 = new MovieDTO(12,"Pushpa","Telugu","Action",7.9,179,"Sukumar",true);
        MovieDTO movie13 = new MovieDTO(13,"Jersey","Telugu","Sports",8.5,160,"Gowtam Tinnanuri",true);
        MovieDTO movie14 = new MovieDTO(14,"Interstellar","English","Sci-Fi",8.6,169,"Christopher Nolan",true);
        MovieDTO movie15 = new MovieDTO(15,"Lucia","Kannada","Thriller",8.5,136,"Pawan Kumar",true);

        list.add(movie1);  list.add(movie2);  list.add(movie3);  list.add(movie4);  list.add(movie5);
        list.add(movie6);  list.add(movie7);  list.add(movie8);  list.add(movie9);  list.add(movie10);
        list.add(movie11); list.add(movie12); list.add(movie13); list.add(movie14); list.add(movie15);

        return list;
    }
    @Bean
    public List<TicketDTO> getTicketInfo() {
        List<TicketDTO> list = new ArrayList<>();

        TicketDTO t1  = new TicketDTO(1,"Bus","Bangalore","Mysore",350.0,"10-02-2025","09:00 AM","Booked");
        TicketDTO t2  = new TicketDTO(2,"Train","Bangalore","Chennai",600.0,"11-02-2025","10:30 PM","Booked");
        TicketDTO t3  = new TicketDTO(3,"Flight","Bangalore","Mumbai",4500.0,"15-02-2025","06:00 AM","Booked");
        TicketDTO t4  = new TicketDTO(4,"Movie","PVR Forum","PVR Forum",250.0,"09-02-2025","07:00 PM","Completed");
        TicketDTO t5  = new TicketDTO(5,"Bus","Mysore","Bangalore",350.0,"12-02-2025","05:00 PM","Booked");
        TicketDTO t6  = new TicketDTO(6,"Train","Chennai","Hyderabad",800.0,"16-02-2025","08:00 PM","Cancelled");
        TicketDTO t7  = new TicketDTO(7,"Flight","Mumbai","Delhi",5500.0,"20-02-2025","09:30 AM","Booked");
        TicketDTO t8  = new TicketDTO(8,"Movie","INOX Garuda","INOX Garuda",220.0,"08-02-2025","09:30 PM","Completed");
        TicketDTO t9  = new TicketDTO(9,"Bus","Udupi","Mangalore",200.0,"13-02-2025","02:00 PM","Booked");
        TicketDTO t10 = new TicketDTO(10,"Train","Hubli","Bangalore",500.0,"18-02-2025","11:00 PM","Booked");
        TicketDTO t11 = new TicketDTO(11,"Flight","Delhi","Goa",6500.0,"25-02-2025","05:30 AM","Booked");
        TicketDTO t12 = new TicketDTO(12,"Movie","Cinepolis","Cinepolis",300.0,"07-02-2025","06:00 PM","Completed");
        TicketDTO t13 = new TicketDTO(13,"Bus","Bangalore","Hyderabad",900.0,"19-02-2025","10:00 PM","Cancelled");
        TicketDTO t14 = new TicketDTO(14,"Train","Bangalore","Pune",1000.0,"21-02-2025","07:30 AM","Booked");
        TicketDTO t15 = new TicketDTO(15,"Flight","Chennai","Bangalore",3500.0,"22-02-2025","08:45 PM","Booked");

        list.add(t1);  list.add(t2);  list.add(t3);  list.add(t4);  list.add(t5);
        list.add(t6);  list.add(t7);  list.add(t8);  list.add(t9);  list.add(t10);
        list.add(t11); list.add(t12); list.add(t13); list.add(t14); list.add(t15);

        return list;
    }
    @Bean
    public List<HospitalDTO> getHospitalInfo() {
        List<HospitalDTO> list = new ArrayList<>();

        HospitalDTO h1  = new HospitalDTO(1,"Apollo Hospital","Bangalore","Private",500,50,true,"080-22223333");
        HospitalDTO h2  = new HospitalDTO(2,"Fortis","Bangalore","Private",400,40,true,"080-24445555");
        HospitalDTO h3  = new HospitalDTO(3,"NIMHANS","Bangalore","Government",300,30,true,"080-26995000");
        HospitalDTO h4  = new HospitalDTO(4,"KMC","Mangalore","Private",350,35,true,"0824-2215555");
        HospitalDTO h5  = new HospitalDTO(5,"KIMS","Hubli","Private",250,20,true,"0836-2372001");
        HospitalDTO h6  = new HospitalDTO(6,"Victoria Hospital","Bangalore","Government",600,40,true,"080-26701150");
        HospitalDTO h7  = new HospitalDTO(7,"Jayadeva Hospital","Bangalore","Government",450,60,true,"080-22977261");
        HospitalDTO h8  = new HospitalDTO(8,"Manipal Hospital","Udupi","Private",300,25,true,"0820-2922271");
        HospitalDTO h9  = new HospitalDTO(9,"AIMS","Delhi","Private",550,70,true,"011-26588500");
        HospitalDTO h10 = new HospitalDTO(10,"AIIMS","Delhi","Government",800,100,true,"011-26588500");
        HospitalDTO h11 = new HospitalDTO(11,"St John’s","Bangalore","Private",420,35,true,"080-49466000");
        HospitalDTO h12 = new HospitalDTO(12,"Bowring Hospital","Bangalore","Government",350,30,true,"080-25596137");
        HospitalDTO h13 = new HospitalDTO(13,"District Hospital","Mysore","Government",300,25,true,"0821-2522147");
        HospitalDTO h14 = new HospitalDTO(14,"Lotus Hospital","Shimoga","Private",200,15,true,"08182-250999");
        HospitalDTO h15 = new HospitalDTO(15,"City Hospital","Tumkur","Private",180,10,true,"0816-2254321");

        list.add(h1);  list.add(h2);  list.add(h3);  list.add(h4);  list.add(h5);
        list.add(h6);  list.add(h7);  list.add(h8);  list.add(h9);  list.add(h10);
        list.add(h11); list.add(h12); list.add(h13); list.add(h14); list.add(h15);

        return list;
    }

    @Bean
    public List<FlightDTO> getFlightInfo() {
        List<FlightDTO> list = new ArrayList<>();

        FlightDTO f1  = new FlightDTO(1,"AI101","Air India","Bangalore","Delhi",6500.0,"06:00 AM",true);
        FlightDTO f2  = new FlightDTO(2,"6E202","IndiGo","Bangalore","Mumbai",5500.0,"08:30 AM",true);
        FlightDTO f3  = new FlightDTO(3,"UK303","Vistara","Delhi","Mumbai",7000.0,"09:45 AM",true);
        FlightDTO f4  = new FlightDTO(4,"SG404","SpiceJet","Chennai","Bangalore",3500.0,"07:15 AM",true);
        FlightDTO f5  = new FlightDTO(5,"G8405","GoFirst","Mumbai","Goa",4000.0,"01:00 PM",true);
        FlightDTO f6  = new FlightDTO(6,"AI506","Air India","Bangalore","Hyderabad",4200.0,"05:30 PM",true);
        FlightDTO f7  = new FlightDTO(7,"6E707","IndiGo","Hyderabad","Delhi",6200.0,"10:00 PM",true);
        FlightDTO f8  = new FlightDTO(8,"UK808","Vistara","Bangalore","Kolkata",7500.0,"11:30 AM",true);
        FlightDTO f9  = new FlightDTO(9,"SG909","SpiceJet","Mumbai","Delhi",5800.0,"02:45 PM",true);
        FlightDTO f10 = new FlightDTO(10,"AI010","Air India","Delhi","Chennai",7200.0,"06:15 AM",true);
        FlightDTO f11 = new FlightDTO(11,"6E111","IndiGo","Bangalore","Pune",4800.0,"09:00 PM",true);
        FlightDTO f12 = new FlightDTO(12,"G8222","GoFirst","Delhi","Goa",6500.0,"04:00 PM",true);
        FlightDTO f13 = new FlightDTO(13,"UK333","Vistara","Kolkata","Delhi",6900.0,"07:30 PM",true);
        FlightDTO f14 = new FlightDTO(14,"SG121","SpiceJet","Chennai","Mumbai",6100.0,"03:15 PM",true);
        FlightDTO f15 = new FlightDTO(15,"AI515","Air India","Hyderabad","Bangalore",4100.0,"08:45 AM",true);

        list.add(f1);  list.add(f2);  list.add(f3);  list.add(f4);  list.add(f5);
        list.add(f6);  list.add(f7);  list.add(f8);  list.add(f9);  list.add(f10);
        list.add(f11); list.add(f12); list.add(f13); list.add(f14); list.add(f15);

        return list;
    }

    @Bean
    public List<DoctorDTO> getDoctorInfo() {
        List<DoctorDTO> list = new ArrayList<>();

        DoctorDTO d1  = new DoctorDTO(1,"Dr. Ramesh","Cardiology",12,"Apollo",9876543210L,"ramesh@apollo.com",true);
        DoctorDTO d2  = new DoctorDTO(2,"Dr. Anita","Neurology",10,"Fortis",9765432109L,"anita@fortis.com",true);
        DoctorDTO d3  = new DoctorDTO(3,"Dr. Kumar","Orthopedic",15,"KMC",9654321098L,"kumar@kmc.com",true);
        DoctorDTO d4  = new DoctorDTO(4,"Dr. Pooja","Pediatrics",8,"NIMHANS",9543210987L,"pooja@nimhans.com",true);
        DoctorDTO d5  = new DoctorDTO(5,"Dr. Arjun","Dermatology",6,"Manipal",9432109876L,"arjun@manipal.com",true);
        DoctorDTO d6  = new DoctorDTO(6,"Dr. Sneha","Gynecology",11,"Apollo",9321098765L,"sneha@apollo.com",true);
        DoctorDTO d7  = new DoctorDTO(7,"Dr. Mohan","ENT",9,"Fortis",9210987654L,"mohan@fortis.com",true);
        DoctorDTO d8  = new DoctorDTO(8,"Dr. Kiran","Psychiatry",7,"NIMHANS",9109876543L,"kiran@nimhans.com",true);
        DoctorDTO d9  = new DoctorDTO(9,"Dr. Ravi","Oncology",14,"KIMS",9098765432L,"ravi@kims.com",true);
        DoctorDTO d10 = new DoctorDTO(10,"Dr. Meera","Radiology",10,"Jayadeva",9987654321L,"meera@jayadeva.com",true);
        DoctorDTO d11 = new DoctorDTO(11,"Dr. Sunil","Urology",13,"Apollo",9876543201L,"sunil@apollo.com",true);
        DoctorDTO d12 = new DoctorDTO(12,"Dr. Divya","Ophthalmology",9,"Bowring",9765432101L,"divya@bowring.com",true);
        DoctorDTO d13 = new DoctorDTO(13,"Dr. Ajith","General Medicine",16,"Victoria",9654321001L,"ajith@victoria.com",true);
        DoctorDTO d14 = new DoctorDTO(14,"Dr. Latha","Pathology",7,"City Hospital",9543210001L,"latha@city.com",true);
        DoctorDTO d15 = new DoctorDTO(15,"Dr. Suresh","Nephrology",18,"AIIMS",9432100001L,"suresh@aiims.com",true);

        list.add(d1);  list.add(d2);  list.add(d3);  list.add(d4);  list.add(d5);
        list.add(d6);  list.add(d7);  list.add(d8);  list.add(d9);  list.add(d10);
        list.add(d11); list.add(d12); list.add(d13); list.add(d14); list.add(d15);

        return list;
    }
    @Bean
    public List<PatientDTO> getPatientInfo() {
        List<PatientDTO> list = new ArrayList<>();

        PatientDTO p1  = new PatientDTO(1,"Rahul",25,"Male","Fever","Dr. Ramesh",9876543210L,"01-02-2025");
        PatientDTO p2  = new PatientDTO(2,"Sneha",22,"Female","Cold","Dr. Anita",9765432109L,"02-02-2025");
        PatientDTO p3  = new PatientDTO(3,"Amit",30,"Male","Fracture","Dr. Kumar",9654321098L,"03-02-2025");
        PatientDTO p4  = new PatientDTO(4,"Neha",19,"Female","Migraine","Dr. Pooja",9543210987L,"04-02-2025");
        PatientDTO p5  = new PatientDTO(5,"Manoj",35,"Male","Skin Allergy","Dr. Arjun",9432109876L,"05-02-2025");
        PatientDTO p6  = new PatientDTO(6,"Divya",28,"Female","Pregnancy","Dr. Sneha",9321098765L,"06-02-2025");
        PatientDTO p7  = new PatientDTO(7,"Ravi",40,"Male","Sinus","Dr. Mohan",9210987654L,"07-02-2025");
        PatientDTO p8  = new PatientDTO(8,"Kavya",21,"Female","Stress","Dr. Kiran",9109876543L,"08-02-2025");
        PatientDTO p9  = new PatientDTO(9,"Lokesh",45,"Male","Cancer","Dr. Ravi",9098765432L,"09-02-2025");
        PatientDTO p10 = new PatientDTO(10,"Megha",32,"Female","Scan","Dr. Meera",9987654321L,"10-02-2025");
        PatientDTO p11 = new PatientDTO(11,"Sunil",50,"Male","Kidney Issue","Dr. Sunil",9876543201L,"11-02-2025");
        PatientDTO p12 = new PatientDTO(12,"Anu",27,"Female","Eye Checkup","Dr. Divya",9765432101L,"12-02-2025");
        PatientDTO p13 = new PatientDTO(13,"Ramesh",60,"Male","BP","Dr. Ajith",9654321001L,"13-02-2025");
        PatientDTO p14 = new PatientDTO(14,"Latha",55,"Female","Blood Test","Dr. Latha",9543210001L,"14-02-2025");
        PatientDTO p15 = new PatientDTO(15,"Suresh",48,"Male","Kidney Failure","Dr. Suresh",9432100001L,"15-02-2025");

        list.add(p1);  list.add(p2);  list.add(p3);  list.add(p4);  list.add(p5);
        list.add(p6);  list.add(p7);  list.add(p8);  list.add(p9);  list.add(p10);
        list.add(p11); list.add(p12); list.add(p13); list.add(p14); list.add(p15);

        return list;
    }

    @Bean
    public List<TrainerDTO> getTrainerInfo() {
        List<TrainerDTO> list = new ArrayList<>();

        TrainerDTO t1  = new TrainerDTO(1,"Ramesh","Java",8,60000.0,9876543210L,"ramesh@gmail.com",true);
        TrainerDTO t2  = new TrainerDTO(2,"Anita","Python",7,55000.0,9765432109L,"anita@gmail.com",true);
        TrainerDTO t3  = new TrainerDTO(3,"Kiran","Data Science",10,75000.0,9654321098L,"kiran@gmail.com",true);
        TrainerDTO t4  = new TrainerDTO(4,"Divya","Web Tech",6,50000.0,9543210987L,"divya@gmail.com",true);
        TrainerDTO t5  = new TrainerDTO(5,"Sunil","Testing",9,65000.0,9432109876L,"sunil@gmail.com",true);
        TrainerDTO t6  = new TrainerDTO(6,"Pooja","HR",5,48000.0,9321098765L,"pooja@gmail.com",true);
        TrainerDTO t7  = new TrainerDTO(7,"Amit","DevOps",11,85000.0,9210987654L,"amit@gmail.com",true);
        TrainerDTO t8  = new TrainerDTO(8,"Sneha","UI/UX",6,52000.0,9109876543L,"sneha@gmail.com",true);
        TrainerDTO t9  = new TrainerDTO(9,"Lokesh","Cloud",12,90000.0,9098765432L,"lokesh@gmail.com",true);
        TrainerDTO t10 = new TrainerDTO(10,"Megha","AI",8,78000.0,9987654321L,"megha@gmail.com",true);
        TrainerDTO t11 = new TrainerDTO(11,"Harsha","Angular",7,66000.0,9876543201L,"harsha@gmail.com",true);
        TrainerDTO t12 = new TrainerDTO(12,"Nithya","React",6,58000.0,9765432101L,"nithya@gmail.com",true);
        TrainerDTO t13 = new TrainerDTO(13,"Ravi","Spring",10,82000.0,9654321001L,"ravi@gmail.com",true);
        TrainerDTO t14 = new TrainerDTO(14,"Latha","Manual Testing",9,64000.0,9543210001L,"latha@gmail.com",true);
        TrainerDTO t15 = new TrainerDTO(15,"Suresh","Cyber Security",13,95000.0,9432100001L,"suresh@gmail.com",true);

        list.add(t1);  list.add(t2);  list.add(t3);  list.add(t4);  list.add(t5);
        list.add(t6);  list.add(t7);  list.add(t8);  list.add(t9);  list.add(t10);
        list.add(t11); list.add(t12); list.add(t13); list.add(t14); list.add(t15);

        return list;
    }

    @Bean
    public List<GymDTO> getGymInfo() {
        List<GymDTO> list = new ArrayList<>();

        GymDTO g1  = new GymDTO(1,"Gold Gym","Bangalore",1200.0,"Rahul",true,"06:00 AM",true);
        GymDTO g2  = new GymDTO(2,"Fitness Pro","Mysore",1000.0,"Amit",false,"05:30 AM",true);
        GymDTO g3  = new GymDTO(3,"Steel Fitness","Tumkur",900.0,"Sunil",false,"06:00 AM",true);
        GymDTO g4  = new GymDTO(4,"Muscle Zone","Hubli",850.0,"Ramesh",false,"06:30 AM",true);
        GymDTO g5  = new GymDTO(5,"Power Gym","Shimoga",950.0,"Kiran",true,"05:00 AM",true);
        GymDTO g6  = new GymDTO(6,"Fit Life","Udupi",1100.0,"Lokesh",true,"06:00 AM",true);
        GymDTO g7  = new GymDTO(7,"Royal Fitness","Bangalore",1300.0,"Pooja",true,"06:30 AM",true);
        GymDTO g8  = new GymDTO(8,"Body Works","Mangalore",900.0,"Sneha",false,"05:30 AM",true);
        GymDTO g9  = new GymDTO(9,"Iron Paradise","Belgaum",850.0,"Harsha",false,"06:00 AM",true);
        GymDTO g10 = new GymDTO(10,"Elite Gym","Davangere",1000.0,"Anita",true,"06:30 AM",true);
        GymDTO g11 = new GymDTO(11,"Legend Fitness","Chitradurga",800.0,"Ravi",false,"05:00 AM",true);
        GymDTO g12 = new GymDTO(12,"Pro Fitness","Mandya",750.0,"Megha",false,"06:00 AM",true);
        GymDTO g13 = new GymDTO(13,"Urban Gym","Hassan",900.0,"Suresh",false,"06:00 AM",true);
        GymDTO g14 = new GymDTO(14,"Metro Gym","Bangalore",1400.0,"Nithya",true,"05:30 AM",true);
        GymDTO g15 = new GymDTO(15,"Prime Fitness","Mysore",1100.0,"Ajith",true,"06:00 AM",true);

        list.add(g1);  list.add(g2);  list.add(g3);  list.add(g4);  list.add(g5);
        list.add(g6);  list.add(g7);  list.add(g8);  list.add(g9);  list.add(g10);
        list.add(g11); list.add(g12); list.add(g13); list.add(g14); list.add(g15);

        return list;
    }
    @Bean
    public List<CompanyDTO> getCompanyInfo() {
        List<CompanyDTO> list = new ArrayList<>();

        CompanyDTO c1  = new CompanyDTO(1,"TCS","Bangalore","IT",400000,250000.0,"Rajesh",true);
        CompanyDTO c2  = new CompanyDTO(2,"Infosys","Mysore","IT",350000,230000.0,"Mohan",true);
        CompanyDTO c3  = new CompanyDTO(3,"Wipro","Bangalore","IT",300000,210000.0,"Ravi",true);
        CompanyDTO c4  = new CompanyDTO(4,"Accenture","Mumbai","IT",450000,300000.0,"Anita",true);
        CompanyDTO c5  = new CompanyDTO(5,"IBM","Pune","IT",280000,200000.0,"Suresh",true);
        CompanyDTO c6  = new CompanyDTO(6,"Capgemini","Chennai","IT",260000,180000.0,"Megha",true);
        CompanyDTO c7  = new CompanyDTO(7,"HCL","Noida","IT",290000,190000.0,"Sunil",true);
        CompanyDTO c8  = new CompanyDTO(8,"Tech Mahindra","Hyderabad","IT",270000,195000.0,"Kiran",true);
        CompanyDTO c9  = new CompanyDTO(9,"Mindtree","Bangalore","IT",80000,75000.0,"Lokesh",true);
        CompanyDTO c10 = new CompanyDTO(10,"L&T","Chennai","Construction",150000,120000.0,"Ajith",true);
        CompanyDTO c11 = new CompanyDTO(11,"Reliance","Mumbai","Retail",500000,400000.0,"Mukesh",true);
        CompanyDTO c12 = new CompanyDTO(12,"Flipkart","Bangalore","E-Commerce",70000,60000.0,"Kalyan",true);
        CompanyDTO c13 = new CompanyDTO(13,"Amazon","Hyderabad","E-Commerce",90000,85000.0,"Jeff",true);
        CompanyDTO c14 = new CompanyDTO(14,"Zomato","Gurgaon","Food Tech",30000,25000.0,"Deepinder",true);
        CompanyDTO c15 = new CompanyDTO(15,"Swiggy","Bangalore","Food Tech",35000,30000.0,"Sriharsha",true);

        list.add(c1);  list.add(c2);  list.add(c3);  list.add(c4);  list.add(c5);
        list.add(c6);  list.add(c7);  list.add(c8);  list.add(c9);  list.add(c10);
        list.add(c11); list.add(c12); list.add(c13); list.add(c14); list.add(c15);

        return list;
    }
    @Bean
    public List<DepartmentDTO> getDepartmentInfo() {
        List<DepartmentDTO> list = new ArrayList<>();

        DepartmentDTO d1  = new DepartmentDTO(1,"CSE","Dr. Ramesh",20,600,"A Block","080-111111",true);
        DepartmentDTO d2  = new DepartmentDTO(2,"ISE","Dr. Anita",18,520,"B Block","080-222222",true);
        DepartmentDTO d3  = new DepartmentDTO(3,"ECE","Dr. Kumar",22,700,"C Block","080-333333",true);
        DepartmentDTO d4  = new DepartmentDTO(4,"EEE","Dr. Pooja",19,550,"D Block","080-444444",true);
        DepartmentDTO d5  = new DepartmentDTO(5,"Mechanical","Dr. Arjun",25,750,"E Block","080-555555",true);
        DepartmentDTO d6  = new DepartmentDTO(6,"Civil","Dr. Ravi",21,680,"F Block","080-666666",true);
        DepartmentDTO d7  = new DepartmentDTO(7,"MBA","Dr. Sneha",15,300,"G Block","080-777777",true);
        DepartmentDTO d8  = new DepartmentDTO(8,"MCA","Dr. Mohan",14,280,"H Block","080-888888",true);
        DepartmentDTO d9  = new DepartmentDTO(9,"Physics","Dr. Meera",10,200,"I Block","080-999999",true);
        DepartmentDTO d10 = new DepartmentDTO(10,"Chemistry","Dr. Divya",12,210,"J Block","080-121212",true);
        DepartmentDTO d11 = new DepartmentDTO(11,"Maths","Dr. Sunil",11,230,"K Block","080-131313",true);
        DepartmentDTO d12 = new DepartmentDTO(12,"Biology","Dr. Kiran",9,190,"L Block","080-141414",true);
        DepartmentDTO d13 = new DepartmentDTO(13,"English","Dr. Latha",8,170,"M Block","080-151515",true);
        DepartmentDTO d14 = new DepartmentDTO(14,"Economics","Dr. Ajith",7,160,"N Block","080-161616",true);
        DepartmentDTO d15 = new DepartmentDTO(15,"History","Dr. Suresh",6,150,"O Block","080-171717",true);

        list.add(d1);  list.add(d2);  list.add(d3);  list.add(d4);  list.add(d5);
        list.add(d6);  list.add(d7);  list.add(d8);  list.add(d9);  list.add(d10);
        list.add(d11); list.add(d12); list.add(d13); list.add(d14); list.add(d15);

        return list;
    }
    @Bean
    public List<BankDTO> getBankInfo() {
        List<BankDTO> list = new ArrayList<>();

        BankDTO b1  = new BankDTO(1,"SBI","MG Road","SBIN0001","Bangalore",9876543210L,true,true);
        BankDTO b2  = new BankDTO(2,"HDFC","BTM","HDFC0002","Bangalore",9765432109L,true,true);
        BankDTO b3  = new BankDTO(3,"ICICI","JP Nagar","ICIC0003","Bangalore",9654321098L,true,true);
        BankDTO b4  = new BankDTO(4,"Axis","RR Nagar","UTIB0004","Bangalore",9543210987L,true,true);
        BankDTO b5  = new BankDTO(5,"Canara","Malleshwaram","CNRB0005","Bangalore",9432109876L,true,true);
        BankDTO b6  = new BankDTO(6,"Union Bank","Whitefield","UBIN0006","Bangalore",9321098765L,true,true);
        BankDTO b7  = new BankDTO(7,"Kotak","Yelahanka","KKBK0007","Bangalore",9210987654L,true,true);
        BankDTO b8  = new BankDTO(8,"IDBI","Hebbal","IBKL0008","Bangalore",9109876543L,true,true);
        BankDTO b9  = new BankDTO(9,"BOB","Kr Puram","BARB0009","Bangalore",9098765432L,true,true);
        BankDTO b10 = new BankDTO(10,"PNB","Rajajinagar","PUNB0010","Bangalore",9987654321L,true,true);
        BankDTO b11 = new BankDTO(11,"Yes Bank","Jayanagar","YESB0011","Bangalore",9876543201L,true,true);
        BankDTO b12 = new BankDTO(12,"IndusInd","HSR","INDB0012","Bangalore",9765432101L,true,true);
        BankDTO b13 = new BankDTO(13,"RBL","Bellandur","RBLB0013","Bangalore",9654321001L,true,true);
        BankDTO b14 = new BankDTO(14,"Federal","Marathahalli","FDRL0014","Bangalore",9543210001L,true,true);
        BankDTO b15 = new BankDTO(15,"South Indian Bank","Basavanagudi","SIBL0015","Bangalore",9432100001L,true,true);

        list.add(b1);  list.add(b2);  list.add(b3);  list.add(b4);  list.add(b5);
        list.add(b6);  list.add(b7);  list.add(b8);  list.add(b9);  list.add(b10);
        list.add(b11); list.add(b12); list.add(b13); list.add(b14); list.add(b15);

        return list;
    }
    @Bean
    public List<AccountDTO> getAccountInfo() {
        List<AccountDTO> list = new ArrayList<>();

        AccountDTO a1  = new AccountDTO(1,"100001","Savings","Rahul",25000.0,"SBI MG Road",true,true);
        AccountDTO a2  = new AccountDTO(2,"100002","Current","Sneha",55000.0,"HDFC BTM",true,true);
        AccountDTO a3  = new AccountDTO(3,"100003","Savings","Amit",42000.0,"ICICI JP Nagar",true,true);
        AccountDTO a4  = new AccountDTO(4,"100004","Savings","Neha",38000.0,"Axis RR Nagar",true,true);
        AccountDTO a5  = new AccountDTO(5,"100005","Current","Manoj",92000.0,"Canara Malleshwaram",true,true);
        AccountDTO a6  = new AccountDTO(6,"100006","Savings","Divya",46000.0,"Union Whitefield",true,true);
        AccountDTO a7  = new AccountDTO(7,"100007","Savings","Kiran",51000.0,"Kotak Yelahanka",true,true);
        AccountDTO a8  = new AccountDTO(8,"100008","Current","Pooja",125000.0,"IDBI Hebbal",true,true);
        AccountDTO a9  = new AccountDTO(9,"100009","Savings","Ravi",67000.0,"BOB KR Puram",true,true);
        AccountDTO a10 = new AccountDTO(10,"100010","Savings","Megha",34000.0,"PNB Rajajinagar",true,true);
        AccountDTO a11 = new AccountDTO(11,"100011","Current","Sunil",88000.0,"Yes Bank Jayanagar",true,true);
        AccountDTO a12 = new AccountDTO(12,"100012","Savings","Nithya",29000.0,"IndusInd HSR",true,true);
        AccountDTO a13 = new AccountDTO(13,"100013","Savings","Lokesh",73000.0,"RBL Bellandur",true,true);
        AccountDTO a14 = new AccountDTO(14,"100014","Current","Harsha",150000.0,"Federal Marathahalli",true,true);
        AccountDTO a15 = new AccountDTO(15,"100015","Savings","Ajay",41000.0,"South Indian Bank",true,true);

        list.add(a1);  list.add(a2);  list.add(a3);  list.add(a4);  list.add(a5);
        list.add(a6);  list.add(a7);  list.add(a8);  list.add(a9);  list.add(a10);
        list.add(a11); list.add(a12); list.add(a13); list.add(a14); list.add(a15);

        return list;
    }
    @Bean
    public List<InsuranceDTO> getInsuranceInfo() {
        List<InsuranceDTO> list = new ArrayList<>();

        InsuranceDTO i1  = new InsuranceDTO(1,"Health","LIC",9500.0,500000.0,10,"Rahul",true);
        InsuranceDTO i2  = new InsuranceDTO(2,"Life","HDFC Life",12000.0,1000000.0,15,"Sneha",true);
        InsuranceDTO i3  = new InsuranceDTO(3,"Vehicle","ICICI Lombard",8000.0,300000.0,5,"Amit",true);
        InsuranceDTO i4  = new InsuranceDTO(4,"Health","Star Health",11000.0,700000.0,8,"Neha",true);
        InsuranceDTO i5  = new InsuranceDTO(5,"Life","Max Life",13500.0,1500000.0,20,"Manoj",true);
        InsuranceDTO i6  = new InsuranceDTO(6,"Vehicle","Bajaj Allianz",7500.0,250000.0,3,"Divya",true);
        InsuranceDTO i7  = new InsuranceDTO(7,"Travel","Tata AIG",5500.0,200000.0,2,"Kiran",true);
        InsuranceDTO i8  = new InsuranceDTO(8,"Health","Care Insurance",9800.0,600000.0,7,"Pooja",true);
        InsuranceDTO i9  = new InsuranceDTO(9,"Life","SBI Life",14000.0,2000000.0,25,"Ravi",true);
        InsuranceDTO i10 = new InsuranceDTO(10,"Vehicle","ACKO",6800.0,220000.0,4,"Megha",true);
        InsuranceDTO i11 = new InsuranceDTO(11,"Health","Religare",10500.0,650000.0,9,"Sunil",true);
        InsuranceDTO i12 = new InsuranceDTO(12,"Travel","HDFC ERGO",6200.0,180000.0,2,"Nithya",true);
        InsuranceDTO i13 = new InsuranceDTO(13,"Life","PNB MetLife",12500.0,1200000.0,18,"Lokesh",true);
        InsuranceDTO i14 = new InsuranceDTO(14,"Vehicle","United India",7200.0,270000.0,5,"Harsha",true);
        InsuranceDTO i15 = new InsuranceDTO(15,"Health","Aditya Birla",11500.0,750000.0,10,"Ajay",true);

        list.add(i1);  list.add(i2);  list.add(i3);  list.add(i4);  list.add(i5);
        list.add(i6);  list.add(i7);  list.add(i8);  list.add(i9);  list.add(i10);
        list.add(i11); list.add(i12); list.add(i13); list.add(i14); list.add(i15);

        return list;
    }
    @Bean
    public List<PolicyDTO> getPolicyInfo() {
        List<PolicyDTO> list = new ArrayList<>();

        PolicyDTO p1  = new PolicyDTO(1,"POL1001","Jeevan Anand","Life",12000.0,20,"Rahul",true);
        PolicyDTO p2  = new PolicyDTO(2,"POL1002","Health Plus","Health",9500.0,10,"Sneha",true);
        PolicyDTO p3  = new PolicyDTO(3,"POL1003","Car Secure","Vehicle",8000.0,5,"Amit",true);
        PolicyDTO p4  = new PolicyDTO(4,"POL1004","Family Health","Health",11000.0,8,"Neha",true);
        PolicyDTO p5  = new PolicyDTO(5,"POL1005","Money Back","Life",13500.0,15,"Manoj",true);
        PolicyDTO p6  = new PolicyDTO(6,"POL1006","Bike Shield","Vehicle",7500.0,3,"Divya",true);
        PolicyDTO p7  = new PolicyDTO(7,"POL1007","Travel Safe","Travel",5500.0,2,"Kiran",true);
        PolicyDTO p8  = new PolicyDTO(8,"POL1008","Senior Care","Health",9800.0,7,"Pooja",true);
        PolicyDTO p9  = new PolicyDTO(9,"POL1009","Child Future","Life",14000.0,20,"Ravi",true);
        PolicyDTO p10 = new PolicyDTO(10,"POL1010","Car Guard","Vehicle",6800.0,4,"Megha",true);
        PolicyDTO p11 = new PolicyDTO(11,"POL1011","Health Protect","Health",10500.0,9,"Sunil",true);
        PolicyDTO p12 = new PolicyDTO(12,"POL1012","Trip Secure","Travel",6200.0,2,"Nithya",true);
        PolicyDTO p13 = new PolicyDTO(13,"POL1013","Life Shield","Life",12500.0,18,"Lokesh",true);
        PolicyDTO p14 = new PolicyDTO(14,"POL1014","Auto Care","Vehicle",7200.0,5,"Harsha",true);
        PolicyDTO p15 = new PolicyDTO(15,"POL1015","Medi Shield","Health",11500.0,10,"Ajay",true);

        list.add(p1);  list.add(p2);  list.add(p3);  list.add(p4);  list.add(p5);
        list.add(p6);  list.add(p7);  list.add(p8);  list.add(p9);  list.add(p10);
        list.add(p11); list.add(p12); list.add(p13); list.add(p14); list.add(p15);

        return list;
    }

}
