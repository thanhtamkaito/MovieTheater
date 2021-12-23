package com.movietheater.repository;

import com.movietheater.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InvoiceRepo extends JpaRepository<Invoice, String> {


        String query = "\n" +
                "SELECT * FROM dbo.invoice i, dbo.schedule_seat sc, dbo.movie m\n" +
                "WHERE i.schedule_seat_id = sc.schedule_seat_id \n" +
                "AND m.movie_id = sc.movie_id \n" +
                "AND i.account_id = ?"    ;
        @Query( value = query, nativeQuery = true)
        Invoice getTicketInfor( String userName);

}
