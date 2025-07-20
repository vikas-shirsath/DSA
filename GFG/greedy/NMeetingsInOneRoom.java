class Solution {
    
    static class Meeting{
        int start, end;
        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<Meeting> meetings = new ArrayList<>();
        
        for(int i = 0; i < start.length; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }
        
        meetings.sort((a, b) -> a.end - b.end);
        
        int count = 1;
        int lastEndTime = meetings.get(0).end;
        
        for(int i = 1; i < start.length; i++) {
            if(meetings.get(i).start > lastEndTime) {
                count++;
                lastEndTime = meetings.get(i).end;
            }
        }
        
        return count;
    }
}