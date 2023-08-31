package classes;
import java.time.LocalTime;

public class Relogio {
	
	private LocalTime horaAtual;
	private int hora, min, seg;
	
	public Relogio(){
		setHora(0);
		setMin(0);
		setSeg(0);
	}
	
	public LocalTime getHoraAtual() {
		return horaAtual;
	}

	public void setHoraAtual(LocalTime horaAtual) {
		this.horaAtual = horaAtual;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(00<=hora && hora<=23)
			this.hora = hora;
		else {
			while(hora>23) {
				hora = hora - 23;
			}
			this.hora = hora;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if(00<=min && min<=59)
			this.min = min;
		else {
			setHora(getHora()+(min/60));
			this.min = min - (min/60)*60;
		}
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		if(00<=seg && seg<=59)
			this.seg = seg;
		else {
			setMin(getMin()+(seg/60));
			this.seg = seg - (seg/60)*60;
		}
	}

	public void programaHorario(int hora, int min, int seg) {
		setHora(hora);
		setMin(min);
		setSeg(seg);
	}

	public void reiniciaHorario() {
		setHora(0);
		setMin(0);
		setSeg(0);
	}

	public void cronometro(int seg) {
		long t1, t2;
		t1 = System.currentTimeMillis();
		System.out.println(imprimeHora24());
		do {
			t2 = System.currentTimeMillis();
		}while((t2-t1)<(seg*1000));
		setSeg((int)(t2-t1)/1000);
		System.out.println(imprimeHora24());
	}

	public String imprimeHora24() {
		return String.format("%02d:%02d:%02d", hora, min, seg);
	}

	public String imprimeHoraAM() {
		if(getHora()<=12)
			return String.format("%02d%02d:%02d:%02d AM", getHora(), getMin(), getSeg());
		else
			return String.format("%02d:%02d:%02d PM", getHora()-12, getMin(), getSeg());
	}
	
	//Faz horário se tornar o da máquina
	public void transformaHora() {
		horaAtual = LocalTime.now();
		setHora(horaAtual.getHour());
		setMin(horaAtual.getMinute());
		setSeg(horaAtual.getSecond());
	}
}
