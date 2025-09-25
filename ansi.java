package brower.lang;

public final class Ansi {
    public static String RESET = "\u001b[0m";
    public static String BLACK = "\u001b[0;30m";
    public static String RED = "\u001b[0;31m";
    public static String GREEN = "\u001b[0;32m";
    public static String YELLOW = "\u001b[0;33m";
    public static String BLUE = "\u001b[0;34m";
    public static String PURPLE = "\u001b[0;35m";
    public static String CYAN = "\u001b[0;36m";
    public static String WHITE = "\u001b[0;37m";
    public static String BLACK_BOLD = "\u001b[1;30m";
    public static String RED_BOLD = "\u001b[1;31m";
    public static String GREEN_BOLD = "\u001b[1;32m";
    public static String YELLOW_BOLD = "\u001b[1;33m";
    public static String BLUE_BOLD = "\u001b[1;34m";
    public static String PURPLE_BOLD = "\u001b[1;35m";
    public static String CYAN_BOLD = "\u001b[1;36m";
    public static String WHITE_BOLD = "\u001b[1;37m";
    public static String BLACK_UNDERLINE = "\u001b[4;30m";
    public static String RED_UNDERLINE = "\u001b[4;31m";
    public static String GREEN_UNDERLINE = "\u001b[4;32m";
    public static String YELLOW_UNDERLINE = "\u001b[4;33m";
    public static String BLUE_UNDERLINE = "\u001b[4;34m";
    public static String PURPLE_UNDERLINE = "\u001b[4;35m";
    public static String CYAN_UNDERLINE = "\u001b[4;36m";
    public static String WHITE_UNDERLINE = "\u001b[4;37m";
    public static String BLACK_BACKGROUND = "\u001b[40m";
    public static String RED_BACKGROUND = "\u001b[41m";
    public static String GREEN_BACKGROUND = "\u001b[42m";
    public static String YELLOW_BACKGROUND = "\u001b[43m";
    public static String BLUE_BACKGROUND = "\u001b[44m";
    public static String PURPLE_BACKGROUND = "\u001b[45m";
    public static String CYAN_BACKGROUND = "\u001b[46m";
    public static String WHITE_BACKGROUND = "\u001b[47m";
    public static String BLACK_BRIGHT = "\u001b[0;90m";
    public static String RED_BRIGHT = "\u001b[0;91m";
    public static String GREEN_BRIGHT = "\u001b[0;92m";
    public static String YELLOW_BRIGHT = "\u001b[0;93m";
    public static String BLUE_BRIGHT = "\u001b[0;94m";
    public static String PURPLE_BRIGHT = "\u001b[0;95m";
    public static String CYAN_BRIGHT = "\u001b[0;96m";
    public static String WHITE_BRIGHT = "\u001b[0;97m";
    public static String BLACK_BOLD_BRIGHT = "\u001b[1;90m";
    public static String RED_BOLD_BRIGHT = "\u001b[1;91m";
    public static String GREEN_BOLD_BRIGHT = "\u001b[1;92m";
    public static String YELLOW_BOLD_BRIGHT = "\u001b[1;93m";
    public static String BLUE_BOLD_BRIGHT = "\u001b[1;94m";
    public static String PURPLE_BOLD_BRIGHT = "\u001b[1;95m";
    public static String CYAN_BOLD_BRIGHT = "\u001b[1;96m";
    public static String WHITE_BOLD_BRIGHT = "\u001b[1;97m";
    public static String BLACK_BACKGROUND_BRIGHT = "\u001b[0;100m";
    public static String RED_BACKGROUND_BRIGHT = "\u001b[0;101m";
    public static String GREEN_BACKGROUND_BRIGHT = "\u001b[0;102m";
    public static String YELLOW_BACKGROUND_BRIGHT = "\u001b[0;103m";
    public static String BLUE_BACKGROUND_BRIGHT = "\u001b[0;104m";
    public static String PURPLE_BACKGROUND_BRIGHT = "\u001b[0;105m";
    public static String CYAN_BACKGROUND_BRIGHT = "\u001b[0;106m";
    public static String WHITE_BACKGROUND_BRIGHT = "\u001b[0;107m";

    public static String black(String string) {
        return String.format("%s%s%s", BLACK, string, RESET);
    }

    public static String red(String string) {
        return String.format("%s%s%s", RED, string, RESET);
    }

    public static String green(String string) {
        return String.format("%s%s%s", GREEN, string, RESET);
    }

    public static String yellow(String string) {
        return String.format("%s%s%s", YELLOW, string, RESET);
    }

    public static String blue(String string) {
        return String.format("%s%s%s", BLUE, string, RESET);
    }

    public static String purple(String string) {
        return String.format("%s%s%s", PURPLE, string, RESET);
    }

    public static String cyan(String string) {
        return String.format("%s%s%s", CYAN, string, RESET);
    }

    public static String white(String string) {
        return String.format("%s%s%s", WHITE, string, RESET);
    }

    public static String blackBold(String string) {
        return String.format("%s%s%s", BLACK_BOLD, string, RESET);
    }

    public static String redBold(String string) {
        return String.format("%s%s%s", RED_BOLD, string, RESET);
    }

    public static String greenBold(String string) {
        return String.format("%s%s%s", GREEN_BOLD, string, RESET);
    }

    public static String yellowBold(String string) {
        return String.format("%s%s%s", YELLOW_BOLD, string, RESET);
    }

    public static String blueBold(String string) {
        return String.format("%s%s%s", BLUE_BOLD, string, RESET);
    }

    public static String purpleBold(String string) {
        return String.format("%s%s%s", PURPLE_BOLD, string, RESET);
    }

    public static String cyanBold(String string) {
        return String.format("%s%s%s", CYAN_BOLD, string, RESET);
    }

    public static String whiteBold(String string) {
        return String.format("%s%s%s", WHITE_BOLD, string, RESET);
    }

    public static String blackUnderline(String string) {
        return String.format("%s%s%s", BLACK_UNDERLINE, string, RESET);
    }

    public static String redUnderline(String string) {
        return String.format("%s%s%s", RED_UNDERLINE, string, RESET);
    }

    public static String greenUnderline(String string) {
        return String.format("%s%s%s", GREEN_UNDERLINE, string, RESET);
    }

    public static String yellowUnderline(String string) {
        return String.format("%s%s%s", YELLOW_UNDERLINE, string, RESET);
    }

    public static String blueUnderline(String string) {
        return String.format("%s%s%s", BLUE_UNDERLINE, string, RESET);
    }

    public static String purpleUnderline(String string) {
        return String.format("%s%s%s", PURPLE_UNDERLINE, string, RESET);
    }

    public static String cyanUnderline(String string) {
        return String.format("%s%s%s", CYAN_UNDERLINE, string, RESET);
    }

    public static String whiteUnderline(String string) {
        return String.format("%s%s%s", WHITE_UNDERLINE, string, RESET);
    }

    public static String blackBackground(String string) {
        return String.format("%s%s%s", BLACK_BACKGROUND, string, RESET);
    }

    public static String redBackground(String string) {
        return String.format("%s%s%s", RED_BACKGROUND, string, RESET);
    }

    public static String greenBackground(String string) {
        return String.format("%s%s%s", GREEN_BACKGROUND, string, RESET);
    }

    public static String yellowBackground(String string) {
        return String.format("%s%s%s", YELLOW_BACKGROUND, string, RESET);
    }

    public static String blueBackground(String string) {
        return String.format("%s%s%s", BLUE_BACKGROUND, string, RESET);
    }

    public static String purpleBackground(String string) {
        return String.format("%s%s%s", PURPLE_BACKGROUND, string, RESET);
    }

    public static String cyanBackground(String string) {
        return String.format("%s%s%s", CYAN_BACKGROUND, string, RESET);
    }

    public static String whiteBackground(String string) {
        return String.format("%s%s%s", WHITE_BACKGROUND, string, RESET);
    }

    public static String blackBright(String string) {
        return String.format("%s%s%s", BLACK_BRIGHT, string, RESET);
    }

    public static String redBright(String string) {
        return String.format("%s%s%s", RED_BRIGHT, string, RESET);
    }

    public static String greenBright(String string) {
        return String.format("%s%s%s", GREEN_BRIGHT, string, RESET);
    }

    public static String yellowBright(String string) {
        return String.format("%s%s%s", YELLOW_BRIGHT, string, RESET);
    }

    public static String blueBright(String string) {
        return String.format("%s%s%s", BLUE_BRIGHT, string, RESET);
    }

    public static String purpleBright(String string) {
        return String.format("%s%s%s", PURPLE_BRIGHT, string, RESET);
    }

    public static String cyanBright(String string) {
        return String.format("%s%s%s", CYAN_BRIGHT, string, RESET);
    }

    public static String whiteBright(String string) {
        return String.format("%s%s%s", WHITE_BRIGHT, string, RESET);
    }

    public static String blackBoldBright(String string) {
        return String.format("%s%s%s", BLACK_BOLD_BRIGHT, string, RESET);
    }

    public static String redBoldBright(String string) {
        return String.format("%s%s%s", RED_BOLD_BRIGHT, string, RESET);
    }

    public static String greenBoldBright(String string) {
        return String.format("%s%s%s", GREEN_BOLD_BRIGHT, string, RESET);
    }

    public static String yellowBoldBright(String string) {
        return String.format("%s%s%s", YELLOW_BOLD_BRIGHT, string, RESET);
    }

    public static String blueBoldBright(String string) {
        return String.format("%s%s%s", BLUE_BOLD_BRIGHT, string, RESET);
    }

    public static String purpleBoldBright(String string) {
        return String.format("%s%s%s", PURPLE_BOLD_BRIGHT, string, RESET);
    }

    public static String cyanBoldBright(String string) {
        return String.format("%s%s%s", CYAN_BOLD_BRIGHT, string, RESET);
    }

    public static String whiteBoldBright(String string) {
        return String.format("%s%s%s", WHITE_BOLD_BRIGHT, string, RESET);
    }

    public static String blackBackgroundBright(String string) {
        return String.format("%s%s%s", BLACK_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String redBackgroundBright(String string) {
        return String.format("%s%s%s", RED_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String greenBackgroundBright(String string) {
        return String.format("%s%s%s", GREEN_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String yellowBackgroundBright(String string) {
        return String.format("%s%s%s", YELLOW_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String blueBackgroundBright(String string) {
        return String.format("%s%s%s", BLUE_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String purpleBackgroundBright(String string) {
        return String.format("%s%s%s", PURPLE_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String cyanBackgroundBright(String string) {
        return String.format("%s%s%s", CYAN_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String whiteBackgroundBright(String string) {
        return String.format("%s%s%s", WHITE_BACKGROUND_BRIGHT, string, RESET);
    }
}
