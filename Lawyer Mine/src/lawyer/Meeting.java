package pkgfinal;


public class Meeting {
private String day;
private String month;
private String year;
private String script;
private String title;
    public Meeting(String day, String month, String year, String script,String title) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.script = script;
   this.title=title;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title ="+title+"  Date ="+day+"-"+month+"-"+year; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
