import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		List<Task> list = new ArrayList<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。"));
		list.add(new Task(LocalDate.of(2021, 9, 15), "〇〇社面談。"));
		list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。"));
		list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。"));
		list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。"));

		list.sort(Comparator.comparing(Task::getDate));

		for (Task sort : list) {
			System.out.println(sort);
		}
	}
}
