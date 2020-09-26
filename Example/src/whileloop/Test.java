package whileloop;

class Test
{
	public static void main(String[] args)
	{
		int hour = 4;
		int min = 30;
	    int angle=	findAngle(hour, min);

		System.out.print(angle);
	}
	public static int findAngle(int hour, int min)
	{
		int h = (hour * 360) / 12 + (min * 360) / (12 * 60);
		int m = (min * 360) / (60);
		int angle = Math.abs(h - m);
		if (angle > 180) {
			angle = 360 - angle;
		}

		return angle;
	}

	
}

