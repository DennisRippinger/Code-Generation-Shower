@Value.Immutable
public interface ValueObject {
  abstract String getName();
  abstract Set<String> getTags();
  abstract Optional<String> getDescription();
}
