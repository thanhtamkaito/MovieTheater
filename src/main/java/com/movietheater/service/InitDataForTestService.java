package com.movietheater.service;


import com.movietheater.dto.ResponInvoiceDTO;
import com.movietheater.entity.*;
import com.movietheater.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class InitDataForTestService {

    private InvoiceRepo invoiceRepo;
    @Autowired
    public void setInvoiceRepo(InvoiceRepo invoiceRepo) {
        this.invoiceRepo = invoiceRepo;
    }

    @Autowired
    AccountRepo accountRepo;
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    MovieRepo movieRepo;

    @Autowired
    ScheduleSeatRepo scheduleSeatRepo;
    @Autowired
    TypeRepo typeRepo;






    public  void initAccount(){
        Roles rolesUser = new Roles();
        rolesUser.setRoleName("User");
        roleRepo.save(rolesUser);

        Roles rolesAdmin = new Roles();
        rolesAdmin.setRoleName("Admin");
        roleRepo.save(rolesAdmin);

        Roles rolesMannager = new Roles();
        rolesMannager.setRoleName("Mannager");
        roleRepo.save(rolesMannager);

        List<Account> accountList = List.of(
                new Account("tienvt5","Hoang Mai"
                        , LocalDate.of(2020,12,10) ,"tienvt5@email"
                        ,"Vu T Tien","Nam"
                        ,"DT03809009000","NA","12345"
                        ,"03298000",LocalDate.of(2020,12,10)
                        ,"Active",rolesUser),
                new  Account("admin","Hoang Mai"
                        , LocalDate.of(2020,12,10) ,"admin@email"
                        ,"Vu T Tien","Nam"
                        ,"DT03809009000","NA","12345"
                        ,"03298000",LocalDate.of(2020,12,10)
                        ,"Active",rolesAdmin),
                new Account("manager","Hoang Mai"
                        , LocalDate.of(2020,12,10) ,"admin@email"
                        ,"Vu T Tien","Nam"
                        ,"DT03809009000","NA","12345"
                        ,"03298000",LocalDate.of(2020,12,10)
                        ,"Active",rolesMannager)


        );

        accountRepo.saveAll(accountList);







    }

    public void  initInvoice(){


        Account accountTienvt5 = accountRepo.findAccountByUserName("tienvt5");
        Account accountAdmin = accountRepo.findAccountByUserName("admin");
        Account accountManager = accountRepo.findAccountByUserName("manager");
        ScheduleSeat scheduleSeat1 = scheduleSeatRepo.getScheduleSeatByMovieId(
                movieRepo.findMovieByMovieNamEnglish("1. Ten tieng Anh").getMovieId());

        ScheduleSeat scheduleSeat2 = scheduleSeatRepo.getScheduleSeatByMovieId(
                movieRepo.findMovieByMovieNamEnglish("2. Ten tieng Anh").getMovieId());

        ScheduleSeat scheduleSeat3 = scheduleSeatRepo.getScheduleSeatByMovieId(
                movieRepo.findMovieByMovieNamEnglish("3. Ten tieng Anh").getMovieId());

        List<Invoice> invoiceList = List.of(
                new Invoice(10
                        , LocalDate.of(2020,10,10)
                        , 1,135000,10,accountTienvt5, scheduleSeat1),

                new Invoice(20
                        , LocalDate.of(2020,10,10)
                        , 1,145000,200,accountAdmin, scheduleSeat2),


                new Invoice(5
                        , LocalDate.of(2020,10,10)
                        , 1,45000,200,accountManager, scheduleSeat3)

        );

        invoiceRepo.saveAll(invoiceList);
    }

    public  void initMovie(){

        List<Movie> movieList = List.of(
                new Movie("1. Jon Spaihts, Scott Derrickson, C. Robert Cargill"
                        , "Gioi thieu noi dung"
                        , "Derrickson", 2, LocalDate.of(2020,12,10)
                , "Cong ty A", LocalDate.of(2021,02,13)
                , "2D", "1. Ten tieng Anh", "Ten tieng viet"
                , "NA", "NA"),
                new Movie("2.  Jon Spaihts, Scott Derrickson, C. Robert Cargill"
                        , "Gioi thieu noi dung"
                        , "Derrickson", 2, LocalDate.of(2020,12,10)
                        , "Cong ty A", LocalDate.of(2021,02,13)
                        , "2D", "2. Ten tieng Anh", "Ten tieng viet"
                        , "NA", "NA"),

                new Movie("3.  Jon Spaihts, Scott Derrickson, C. Robert Cargill"
                        , "Gioi thieu noi dung"
                        , "Derrickson", 2, LocalDate.of(2020,12,10)
                        , "Cong ty A", LocalDate.of(2021,02,13)
                        , "2D", "3. Ten tieng Anh", "Ten tieng viet"
                        , "NA", "NA")

        );

        movieRepo.saveAll(movieList);


    }

    public void  initScheduleSeat(){

        Movie movie1 = movieRepo.findMovieByMovieNamEnglish("1. Ten tieng Anh");
        Movie movie2 = movieRepo.findMovieByMovieNamEnglish("2. Ten tieng Anh");
        Movie movie3 = movieRepo.findMovieByMovieNamEnglish("3. Ten tieng Anh");

      List<ScheduleSeat> scheduleSeatList = List.of(
              new ScheduleSeat(movie1),
              new ScheduleSeat(movie2),
              new ScheduleSeat(movie3)
      );

      scheduleSeatRepo.saveAll(scheduleSeatList);


    }

    public  void  initType(){
        List<Type> types = List.of(
                new Type(1,"Hanh dong"),
                new Type(2,"Kinh di"),
                new Type(3,"Tham hiem"),
                new Type(4,"Vien Tuong"),
                new Type(5,"Co trang")
        );

        typeRepo.saveAll(types);


    }


    public ResponInvoiceDTO getTicket(String userName){

        ResponInvoiceDTO responInvoiceDTO = new ResponInvoiceDTO();
        Invoice invoice = invoiceRepo.getTicketInfor(userName);
        responInvoiceDTO.setBookingDate(invoice.getBookingDate());
        responInvoiceDTO.setAddScore(invoice.getAddScore());
        responInvoiceDTO.setMovieNamEnglish(invoice.getScheduleSeat().getMovie().getMovieNamEnglish());
        responInvoiceDTO.setMovieNameVN(invoice.getScheduleSeat().getMovie().getMovieNameVN());
        return responInvoiceDTO;

    }



}
