package confwithanno;

public interface IConfig {
    @Value(value = "db.url")
    String dbUrl();

    @Value(value="db.pool.size")
    int poolSize();
}
