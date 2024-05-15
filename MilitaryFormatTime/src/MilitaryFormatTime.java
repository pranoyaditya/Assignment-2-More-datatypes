// This class gives the time duration between given input times in military format

// Here is a sample run. User input is,
// Please enter the first time: 0900
// Please enter the second time: 1730
// 8 hours 30 minutes

// Please enter the first time: 1730
// Please enter the second time: 0900
// 15 hours 30 minutes

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MilitaryFormatTime {
    
    // returns minutes difference of given two input time.
    public String getDuration(String firstMilitaryTime, String secondMilitaryTime)
    {
        

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");

        LocalTime firstTime = LocalTime.from(formatter.parse(firstMilitaryTime));
        LocalTime secondTime = LocalTime.from(formatter.parse(secondMilitaryTime));

        Duration duration = Duration.between(firstTime, secondTime);

        if(duration.isNegative())
        {
            LocalDateTime firstDateTime = LocalDateTime.of(LocalDate.now(),firstTime);
            LocalDateTime secondDateTime = LocalDateTime.of(LocalDate.now(),secondTime);

            secondDateTime = secondDateTime.plusDays(1);

            duration = Duration.between(firstDateTime, secondDateTime);

        }

        String output = duration.toHoursPart() + " hours " + duration.toMinutesPart() + " minutes ";


        return output;
    }

    
}
