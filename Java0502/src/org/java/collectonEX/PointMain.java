package org.java.collectonEX;

import java.util.Iterator;
import java.util.Vector;

class Point{
	
	private int x; //x좌표
	private int y;// y좌표
//매개변수있는 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() { //객체의 문자열 
		return "x좌표 : "+x
					+"y좌표 : "+y;
					
	}
}
public class PointMain {
public static void main(String[] args) {
	
	//백터 객체생성
	Vector<Point> p1=new Vector<Point>();
	p1.add(new Point(100, 200));
	p1.add(new Point(200, 300));
	p1.add(new Point(300, 400));
	p1.add(new Point(400, 500));
	p1.add(new Point(500, 600));
	
	//확장형 for문 출력 
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
