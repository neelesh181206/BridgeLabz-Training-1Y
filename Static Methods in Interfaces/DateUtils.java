import java.time.LocalDate;

interface DateUtils {

    static String formatDate(LocalDate date) {
        return date.toString();
    }
}
