public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public boolean isValid(){
        if(month<1 || month>12){
            return false;
        }
        if(day < 1 || day > getDayInMonth()) {
            return false;
        }
        return true;
    }
    private int getDayInMonth() {
        int[] dayInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear() && month==2){
            return 29;
        }
        return dayInMonth[month-1];
    }
    private boolean isLeapYear() {
        return (year %4==0 && year % 100 !=0) || (year % 400==0);
    }
    public void nextDay(){
        day++;
        if(day > getDayInMonth()){
            day=1;
            month++;
            if(month<12){
                month=1;
                year++;
            }
        }
    }
    public static void main(String[] args) {
        Date date=new Date(8, 02, 2024);
        System.out.println("Current date: "+date.day+"/"+date.month+"/"+date.year);
        if(date.isValid()){
            date.nextDay();
            System.out.println("Next day :" +date.day + "/"+date.month+"/"+date.year);

        }else {
            System.out.println("Invalid date");
        }
    }
    }
