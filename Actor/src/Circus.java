import java.util.ArrayList;
import java.util.List;

public class Circus<T extends Actor>
{
	private List<T> perfomers;

	public Circus(){
		this.perfomers = new ArrayList<>();
	}

	public  void addPerformer(T t){
		this.perfomers.add(t);
	}

	public  void removePerformer(T t){
		this.perfomers.remove(t);
	}

	public String showPerformance(){
		String message = null;
		for (T t : this.perfomers){
			message = "Perfomance " + t + "/n";
		}
		return message;
	}
}
