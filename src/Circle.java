public class Circle {
    double radius;
  /** Создает круг с радиусом, равным 1  */
    Circle() {
        radius = 1;
    }
    Circle(double newRadius){
        radius=newRadius;
    }
    /**Возвращаем площадь круга*/
    double getArea(){
        return radius*radius*Math.PI;
    }
    /**Возвращаем периметр круга*/
    double getPerimetr(){
        return  2*radius*Math.PI;
    }
    /** Присваем новый радиус этому кругу*/
    void setRadius(double newRadius){
        radius = newRadius;
    }
}

