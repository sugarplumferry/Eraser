/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import world.Bullet;

/**
 *
 * @author dorian
 */
public class BulletRenderer {
    
    private static final int R = 5;
    
    
    public static void render(Graphics2D g, Bullet bullet) {
        g.setColor(Color.GREEN);
        g.drawOval(bullet.x() - R, bullet.y() - R, R + R, R + R);
    }
}
