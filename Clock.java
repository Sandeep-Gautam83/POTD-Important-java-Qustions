public class Clock {
        private int hours;
        private int minutes;
        private int seconds;
        private boolean am;
    
        public Clock(int hours, int minutes, int seconds, boolean am) {
            setTime(hours, minutes, seconds, am);
        }
        public void setTime(int hours, int minutes, int seconds, boolean am) {
            if (isValidTime(hours, minutes, seconds)) {
                this.hours = hours;
                this.minutes = minutes;
                this.seconds = seconds;
                this.am = am;
            } else {
                throw new IllegalArgumentException("Invalid time");
            }
        }
    
        public boolean isValidTime(int hours, int minutes, int seconds) {
            return (hours >= 0 && hours < 12) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);
        }
    
        public void setToAM() {
            am = true;
        }
    
        public void setToPM() {
            am = false;
        }
    
        public boolean isAM() {
            return am;
        }
    
        public int getHours() {
            return hours;
        }
    
        public int getMinutes() {
            return minutes;
        }
    
        public int getSeconds() {
            return seconds;
        }
    
        public String toString() {
            return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, am ? "AM" : "PM");
        }
    } 

