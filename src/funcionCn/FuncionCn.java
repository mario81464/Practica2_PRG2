package funcionCn;

public class FuncionCn implements IFuncionCn{
	
	public double CnRD(int n) {		
		if(n==0) {
			return 1;
		}else {
			double sum=0;
			for(int i=0;i<n;i++) {
				sum+=CnRD(i);
			}
			return (2.0/n)*sum+n;
		}
	}
	
	@Override
	public double CnCRD(int n) {
		if(n==0) {
			return 1;
		}else {
			double suma= CnCRD(n-1,1);

			return (2.0/n)*suma+n;
		}
	}
	
	public double CnCRD(int n, double sum) {
		if(n==0) {
			return sum;
		}else {
			return CnCRD(n-1,sum+CnRD(n));
		}
	}

	@Override
	public double CnI(int n) {
		double[] aux= new double[n+1];
		aux[0]=1;
		
		for(int i=1;i<=n;i++) {
			double sum=0;
			for(int j=0;j<i;j++) {
				sum+=aux[j];
			}
			aux[i]=(2.0/i)*sum+i;
		}
		return aux[n];
	}

	@Override
	public double CnIterativaLineal(int n) {
		if(n==0) {
			return 1;
		}else {
			double sum=1;
			for(int i=1;i<n;i++) {
				sum+=(2.0/i)*sum+i;
			}
			return (2.0/n)*sum+n;
		}
	}

	@Override
	public double CnRecursivaLineal(int n) {
		if(n==0) {
			return 1;
		}else {
			return (2.0/n)*sumaux(n-1)+n;
		}
	}
	
	public double sumaux(int n) {
		if(n==0) {
			return 1;
		}else {
			double aux= sumaux(n-1);
			return aux+(2.0/n)*aux+n;
		}
	}
	
}
