package durga.javalangpkg;

public final class ImmutableClass {
	int i;
	public static void main(String[] args) {
		ImmutableClass im=new ImmutableClass(25);
		System.out.println(im);
		ImmutableClass im2= im.modify(25);
		System.out.println(im2);
		ImmutableClass im3=im.modify(23);
		System.out.println(im3);
	}
	public ImmutableClass(int i) {
		this.i=i;
	}
	
	ImmutableClass modify(int i){
		if(this.i==i){
			return this;
		}else{
			return (new ImmutableClass(i));
		}
	}
}
