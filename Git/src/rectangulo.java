/*Un rectangulo tiene lados y estamos interesados en su area y su perimetro.*/

public class rectangulo{

	private double base;
	private double altura;

/*constructor por defecto*/
	public rectangulo(){
		base=0.0;
		altura=0.0;
	}
/*c'est le constructor*/
	public rectangulo(double b,double a){
		if(b==0 || a==0){
			System.out.println("La base y la altura deben ser positivas");
		}else{
			base=b;
			altura=a;
			System.out.println("Mola");
		}
		//controlar la validacion aqui
	}
/*c'est le consulteur du la base*/
	public double getBase(){
		return base;
	}
/*c'est le modificateur du la base*/
	public void setBase(double b){
		base=b;
	}
/*c'est le consulteur du la haut*/
	public double getAltura(){
		return altura;
	}
/*c'est le modificateur du la haut*/
	public void setAltura(double a){
		altura=a;
	}
/*c'est le tiradeur du le corde*/
	public String toString(){
		String s="("+getBase()+", "+getAltura()+", "+perimetro()+", "+area()+")";
		return s;
	}
/*c'est le perimetro*/
	public double perimetro(){
		double perimetro;
		perimetro=2*(base+altura);
		return perimetro;
	}
/*c'est la area*/
	public double area(){
		double area;//esto fuera, se devuelve simplemente el calculo
		area=base*altura;
		return area;
	}


}