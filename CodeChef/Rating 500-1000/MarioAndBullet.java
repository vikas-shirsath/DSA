// Mario and Bullet
// Mario's bullet moves at X pixels per frame. He wishes to shoot a goomba standing Y pixels away from him. The goomba does not move.

// Find the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least Z seconds from now.

import java.lang.*;
import java.util.*;

class MarioAndBullet
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int time = Y/X;
            if(Z == time || Z < time) {
                System.out.println(0);
            }else {
                System.out.println(Z - time);
            }
        }
	}
}