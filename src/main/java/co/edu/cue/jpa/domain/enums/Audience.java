package co.edu.cue.jpa.domain.enums;

public enum Audience {
    ADULTS("Adults") {
        @Override
        public int getAvailableAge() {
            return 18;
        }
    },
    KIDS("Kids") {
        @Override
        public int getAvailableAge() {
            return 4;
        }
    },
    ;

    private final String value;

    Audience(String value) {
        this.value = value;
    }

    public abstract int getAvailableAge();
}
