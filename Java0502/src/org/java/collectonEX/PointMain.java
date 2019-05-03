package org.java.collectonEX;

import java.util.Iterator;
import java.util.Vector;

class Point{
	
	private int x; //x��ǥ
	private int y;// y��ǥ
//�Ű������ִ� ������
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() { //��ü�� ���ڿ� 
		return "x��ǥ : "+x
					+"y��ǥ : "+y;
					
	}
}
public class PointMain {
public static void main(String[] args) {
	
	//���� ��ü����
	Vector<Point> p1=new Vector<Point>();
	p1.add(new Point(100, 200));
	p1.add(new Point(200, 300));
	p1.add(new Point(300, 400));
	p1.add(new Point(400, 500));
	p1.add(new Point(500, 600));
	
	//Ȯ���� for�� ��� 
	for(Point p:p1) {
		System.out.println(p.toString());
	}
	System.out.println();

	
	//Iterator

	Iterator<Point> iterator= p1.iterator();
	while(iterator.hasNext()) {
		Point p2 =iterator.next();
		System.out.println(p2.toString());
	}
}
}
