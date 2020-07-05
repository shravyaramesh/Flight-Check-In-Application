<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2></br>

Airlines: ${reservation.flight.operatingAirlines}</br>
Flight no.: ${reservation.flight.flightNumber}</br>
Departure City: ${reservation.flight.departureCity}</br>
Arrival City: ${reservation.flight.arrivalCity}</br>
Date of Departure: ${reservation.flight.dateOfDeparture}</br>
Estimated Time of Departure: ${reservation.flight.estimatedDepartureTime}</br></br>


<h2>Passenger Details</h2></br>

First Name: ${reservation.passenger.firstName}</br>
Last Name: ${reservation.passenger.lastName}</br>
Email Id.: ${reservation.passenger.email}</br>
Phone No.: ${reservation.passenger.phone}</br></br>

<pre>
<form action="completeCheckin" method="POST">
Enter the number of bags you want to checkin: <input type="text" name="numberOfBags"/>
<input type="hidden" value="${reservation.id}" name="reservationId"/>
<input type="submit" value="Check In"/>
</form>
</pre>
</body>
</html>