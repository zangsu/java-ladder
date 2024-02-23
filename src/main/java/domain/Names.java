package domain;

import java.util.List;

public class Names {

    private final List<Name> names;

    public Names(List<String> names) { // TODO 리스트 사이즈 검증
        this.names = names.stream()
                .map(Name::new)
                .toList();
    }

    public int size() {
        return names.size();
    }

    public List<String> getNames() {
        return names.stream()
                .map(Name::getName)
                .toList();
    }
}
