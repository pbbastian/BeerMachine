package beermachine.data.tasks;

public interface Task<TOutput> {
    TOutput Execute();
}
