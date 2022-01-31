package pedro.test.common.types;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public enum LabelType {

        BUG("Bug", 1),
        DOCUMENTATION("Documentation", 2),
        DUPLICATE("Duplicate", 3),
        ENHANCEMENT("Enhancement", 4),
        GOOD_FIRST_ISSUE("Good First Issue", 5),
        HELP_WANTED("Help Wanted", 6),
        INVALID("Invalid", 7),
        QUESTION("Question", 8),
        WONT_FIX("Wont Fix", 9);

        private final String name;
        private final Integer typeId;

        LabelType (String name, Integer typeId){
            this.name = name;
            this.typeId = typeId;
        }

        public static LabelType asMyEnum(Integer key) throws IllegalArgumentException {
            for (LabelType me : LabelType.values()) {
                try {
                    if (me.getTypeId() ==key ) {
                        return me;
                    }
                } catch (final IllegalArgumentException e) {
                    throw new IllegalArgumentException("Ilegal label argument. It must be an Integer between 1 and 9");
                }
            }
            return null;
        }

        public String getDesctription(Integer typeId){
            return asMyEnum(typeId).getName();
        }
        public String getName() {
            return this.name;
        }

        public Integer getTypeId() {
            return this.typeId;
        }

    }


