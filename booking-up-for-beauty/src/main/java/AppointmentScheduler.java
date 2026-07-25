import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        //solved 1 test
        return LocalDateTime.parse(appointmentDateDescription, DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        // this exercise passed 11 test
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        //passed 7 test
        int hour = appointmentDate.getHour();

        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // to add the word "at" you need to enclose to simple quotes 'at'
        //passed 3 test
        return "You have an appointment on " + DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.").format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {

        return LocalDate.of(LocalDate.now().getYear(),9,15);
    }
}
