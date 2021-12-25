



USE Test

SELECT * FROM dbo.account
SELECT * FROM dbo.roles
SELECT *FROM dbo.invoice
SELECT * FROM dbo.movie
SELECT * FROM dbo.show_date

SELECT i.booking_date, m.movie_nam_english, m.movie_namevn, i.add_score, i.user_score FROM dbo.invoice i, dbo.schedule_seat sc, dbo.movie m
WHERE i.schedule_seat_id = sc.schedule_seat_id 
AND m.movie_id = sc.movie_id 
AND i.account = '4810b197-f763-476b-92c9-cf7b60c87539'


SELECT * FROM dbo.schedule_seat
SELECT * FROM dbo.schedule_seat WHERE dbo.schedule_seat.movie_id = '8d1bea12-9840-4df5-9934-8da99174a412'






