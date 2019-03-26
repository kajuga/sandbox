package stepic.JAVA_base_course;

public class ScenesRoles {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Городничий: Господа, сообщаю вам пренеприятное известие, его поведал мне Артемий Филиппович: к нам едет ревизор."};
        System.out.println(printTextPerRole(roles,textLines));
    }


    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder [] roleCollector = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            roleCollector[i]  = new StringBuilder(roles[i]).append(':');
        }
        for (int i = 0; i < textLines.length; i++) {
            for (int j = 0; j < roleCollector.length; j++) {
                if (textLines[i].startsWith(roles[j] + ":")) {
                    Integer cur = (i + 1);
                    String number = Integer.toString(cur) + ")";
                    String cap = roles[j] + ":";
                    roleCollector[j].append("\n").append(textLines[i].replaceFirst(cap, number).trim());
                    break;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < roleCollector.length; i++) {
            result.append(roleCollector[i]).append("\n").append("\n");
        }
        return String.valueOf(result);
    }
}
