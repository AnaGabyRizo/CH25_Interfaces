public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado  c1 = new Cuadrado("Cuadradote",10);
		Rectangulo r1 = new Rectangulo("Rectangulote",30,21);
		Rombo r2 = new Rombo("Rombote",2,1,3);
		Romboide r3 = new Romboide("Romboidote",44,22);
		Trapecio t3 = new Trapecio("Trapeciote",51,2,64,10,14,28,33);
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		areasYPerimetros.areaPerimetro(t1);
		areasYPerimetros.areaPerimetro(t2);
		areasYPerimetros.areaPerimetro(c1);
		areasYPerimetros.areaPerimetro(r1);
		areasYPerimetros.areaPerimetro(r2);
		areasYPerimetros.areaPerimetro(r3);
		areasYPerimetros.areaPerimetro(t3);
	}//main

		
		
}//class testFiguras