//729. My Calendar I

class MyCalendar {
    private List<int[]> calender;
    public MyCalendar() {
        calender = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] event : calender) {
            if(event[0] < end && start < event[1]) {
                return false;
            }
        }
        calender.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */