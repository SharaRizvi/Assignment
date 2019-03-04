public class Q1FunctionalInterface {
        @FunctionalInterface
        interface Compare{
            boolean isGreater(int a,int b);
        }

        @FunctionalInterface
        interface Incrementer{
            int increment(int a);
        }

        @FunctionalInterface
        interface StringsConcatenation{
            String concat(String s1, String s2);
        }

        @FunctionalInterface
        interface StringsUpperCase{
            String upper(String s1);
        }
        public static void main(String[] args) {

            Compare com=(int a, int b) ->{
                return (a>b)?true:false;
            };
            System.out.println(com.isGreater(2,5));

            Incrementer incrementer=(int a)->++a;
            System.out.println(incrementer.increment(5));

            StringsConcatenation strConcat=(s1,s2)->s1.concat(s2);
            System.out.println(strConcat.concat("Shara"," Fatima Rizvi"));

            StringsUpperCase stringsUpperCase=s->s.toUpperCase();
            System.out.println(stringsUpperCase.upper("Shara"));
        }
    }
