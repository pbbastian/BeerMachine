package beermachine.data.queries;

public interface Query<TOutput> {
    TOutput Execute();
}
