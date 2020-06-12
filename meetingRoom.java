
public class Interval
{
	int start;
	int end;
	Interval() {start = 0; end = 0;}
	Interval(int s, int e) {start = s; end = e;}

}

public boolean canAttendMeetings(Interval[] intervals)
{
int []start = new int[intervals.length];
int []ends = new int[intervals.length];
for(int i = 0; i < intervals.length; i++)
{
	starts[i] = intervals[i].start;
	ends[i] = intervals[i].end;
}
Arrays.sort(start);
Arrays.sort(ends);
for(int i = 0; i < starts.length; i++)
{
	if(starts[i+1] < ends[i])
	{
		return false;
	}
}
	return true;
}
