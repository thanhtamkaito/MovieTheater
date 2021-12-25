

CREATE DATABASE Test2

USE Test


INSERT INTO dbo.ticket
(
    price,
    ticket_type
)
VALUES
(   45000, -- price - int
    1  -- ticket_type - int
    )
INSERT INTO dbo.ticket
(
    price,
    ticket_type
)
VALUES
(   65000, -- price - int
    1  -- ticket_type - int
    )
INSERT INTO dbo.ticket
(
    price,
    ticket_type
)
VALUES
(   1000, -- price - int
    0  -- ticket_type - int
    )

GO

INSERT INTO dbo.cinema_room
(
    cinema_room_name,
    seat_quantity,
    ticket_id
)
VALUES
(   'ROOM1', -- cinema_room_name - varchar(255)
    60,  -- seat_quantity - int
    1   -- ticket_id - int
    )
INSERT INTO dbo.cinema_room
(
    cinema_room_name,
    seat_quantity,
    ticket_id
)
VALUES
(   'ROOM2', -- cinema_room_name - varchar(255)
    30,  -- seat_quantity - int
    2   -- ticket_id - int
    )
INSERT INTO dbo.cinema_room
(
    cinema_room_name,
    seat_quantity,
    ticket_id
)
VALUES
(   'ROOM3', -- cinema_room_name - varchar(255)
    50,  -- seat_quantity - int
    1   -- ticket_id - int
    )



INSERT INTO dbo.seat
(
    seat_column,
    seat_row,
    seat_status,
    seat_type,
    cinema_room_id
)
VALUES
(   'A', -- seat_column - varchar(255)
    1,  -- seat_row - int
    0,  -- seat_status - int
    0,  -- seat_type - int
    3   -- cinema_room_id - int
    )
INSERT INTO dbo.seat
(
    seat_column,
    seat_row,
    seat_status,
    seat_type,
    cinema_room_id
)
VALUES
(   'A', -- seat_column - varchar(255)
    2,  -- seat_row - int
    0,  -- seat_status - int
    0,  -- seat_type - int
    1   -- cinema_room_id - int
    )
INSERT INTO dbo.seat
(
    seat_column,
    seat_row,
    seat_status,
    seat_type,
    cinema_room_id
)
VALUES
(   'B', -- seat_column - varchar(255)
    2,  -- seat_row - int
    0,  -- seat_status - int
    0,  -- seat_type - int
    1   -- cinema_room_id - int
    )
INSERT INTO dbo.seat
(
    seat_column,
    seat_row,
    seat_status,
    seat_type,
    cinema_room_id
)
VALUES
(   'C', -- seat_column - varchar(255)
    2,  -- seat_row - int
    0,  -- seat_status - int
    0,  -- seat_type - int
    1   -- cinema_room_id - int
    )
INSERT INTO dbo.seat
(
    seat_column,
    seat_row,
    seat_status,
    seat_type,
    cinema_room_id
)
VALUES
(   'A', -- seat_column - varchar(255)
    2,  -- seat_row - int
    0,  -- seat_status - int
    0,  -- seat_type - int
    2   -- cinema_room_id - int
    )
INSERT INTO dbo.seat
(
    seat_column,
    seat_row,
    seat_status,
    seat_type,
    cinema_room_id
)
VALUES
(   'B', -- seat_column - varchar(255)
    2,  -- seat_row - int
    0,  -- seat_status - int
    0,  -- seat_type - int
    2   -- cinema_room_id - int
    )
INSERT INTO dbo.seat
(
    seat_column,
    seat_row,
    seat_status,
    seat_type,
    cinema_room_id
)
VALUES
(   'C', -- seat_column - varchar(255)
    2,  -- seat_row - int
    0,  -- seat_status - int
    0,  -- seat_type - int
    2   -- cinema_room_id - int
    )

---------------------------------------------------------------------------






