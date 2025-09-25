public final class Ansi {
    public static String RESET = "\\e[0m";
    public static String BLACK = "\\e[0;30m";
    public static String RED = "\\e[0;31m";
    public static String GREEN = "\\e[0;32m";
    public static String YELLOW = "\\e[0;33m";
    public static String BLUE = "\\e[0;34m";
    public static String PURPLE = "\\e[0;35m";
    public static String CYAN = "\\e[0;36m";
    public static String WHITE = "\\e[0;37m";
    public static String BLACK_BOLD = "\\e[1;30m";
    public static String RED_BOLD = "\\e[1;31m";
    public static String GREEN_BOLD = "\\e[1;32m";
    public static String YELLOW_BOLD = "\\e[1;33m";
    public static String BLUE_BOLD = "\\e[1;34m";
    public static String PURPLE_BOLD = "\\e[1;35m";
    public static String CYAN_BOLD = "\\e[1;36m";
    public static String WHITE_BOLD = "\\e[1;37m";
    public static String BLACK_UNDERLINE = "\\e[4;30m";
    public static String RED_UNDERLINE = "\\e[4;31m";
    public static String GREEN_UNDERLINE = "\\e[4;32m";
    public static String YELLOW_UNDERLINE = "\\e[4;33m";
    public static String BLUE_UNDERLINE = "\\e[4;34m";
    public static String PURPLE_UNDERLINE = "\\e[4;35m";
    public static String CYAN_UNDERLINE = "\\e[4;36m";
    public static String WHITE_UNDERLINE = "\\e[4;37m";
    public static String BLACK_BACKGROUND = "\\e[40m";
    public static String RED_BACKGROUND = "\\e[41m";
    public static String GREEN_BACKGROUND = "\\e[42m";
    public static String YELLOW_BACKGROUND = "\\e[43m";
    public static String BLUE_BACKGROUND = "\\e[44m";
    public static String PURPLE_BACKGROUND = "\\e[45m";
    public static String CYAN_BACKGROUND = "\\e[46m";
    public static String WHITE_BACKGROUND = "\\e[47m";
    public static String BLACK_BRIGHT = "\\e[0;90m";
    public static String RED_BRIGHT = "\\e[0;91m";
    public static String GREEN_BRIGHT = "\\e[0;92m";
    public static String YELLOW_BRIGHT = "\\e[0;93m";
    public static String BLUE_BRIGHT = "\\e[0;94m";
    public static String PURPLE_BRIGHT = "\\e[0;95m";
    public static String CYAN_BRIGHT = "\\e[0;96m";
    public static String WHITE_BRIGHT = "\\e[0;97m";
    public static String BLACK_BOLD_BRIGHT = "\\e[1;90m";
    public static String RED_BOLD_BRIGHT = "\\e[1;91m";
    public static String GREEN_BOLD_BRIGHT = "\\e[1;92m";
    public static String YELLOW_BOLD_BRIGHT = "\\e[1;93m";
    public static String BLUE_BOLD_BRIGHT = "\\e[1;94m";
    public static String PURPLE_BOLD_BRIGHT = "\\e[1;95m";
    public static String CYAN_BOLD_BRIGHT = "\\e[1;96m";
    public static String WHITE_BOLD_BRIGHT = "\\e[1;97m";
    public static String BLACK_BACKGROUND_BRIGHT = "\\e[0;100m";
    public static String RED_BACKGROUND_BRIGHT = "\\e[0;101m";
    public static String GREEN_BACKGROUND_BRIGHT = "\\e[0;102m";
    public static String YELLOW_BACKGROUND_BRIGHT = "\\e[0;103m";
    public static String BLUE_BACKGROUND_BRIGHT = "\\e[0;104m";
    public static String PURPLE_BACKGROUND_BRIGHT = "\\e[0;105m";
    public static String CYAN_BACKGROUND_BRIGHT = "\\e[0;106m";
    public static String WHITE_BACKGROUND_BRIGHT = "\\e[0;107m";

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

    public static String black_bold(String string) {
        return String.format("%s%s%s", BLACK_BOLD, string, RESET);
    }

    public static String red_bold(String string) {
        return String.format("%s%s%s", RED_BOLD, string, RESET);
    }

    public static String green_bold(String string) {
        return String.format("%s%s%s", GREEN_BOLD, string, RESET);
    }

    public static String yellow_bold(String string) {
        return String.format("%s%s%s", YELLOW_BOLD, string, RESET);
    }

    public static String blue_bold(String string) {
        return String.format("%s%s%s", BLUE_BOLD, string, RESET);
    }

    public static String purple_bold(String string) {
        return String.format("%s%s%s", PURPLE_BOLD, string, RESET);
    }

    public static String cyan_bold(String string) {
        return String.format("%s%s%s", CYAN_BOLD, string, RESET);
    }

    public static String white_bold(String string) {
        return String.format("%s%s%s", WHITE_BOLD, string, RESET);
    }

    public static String black_underline(String string) {
        return String.format("%s%s%s", BLACK_UNDERLINE, string, RESET);
    }

    public static String red_underline(String string) {
        return String.format("%s%s%s", RED_UNDERLINE, string, RESET);
    }

    public static String green_underline(String string) {
        return String.format("%s%s%s", GREEN_UNDERLINE, string, RESET);
    }

    public static String yellow_underline(String string) {
        return String.format("%s%s%s", YELLOW_UNDERLINE, string, RESET);
    }

    public static String blue_underline(String string) {
        return String.format("%s%s%s", BLUE_UNDERLINE, string, RESET);
    }

    public static String purple_underline(String string) {
        return String.format("%s%s%s", PURPLE_UNDERLINE, string, RESET);
    }

    public static String cyan_underline(String string) {
        return String.format("%s%s%s", CYAN_UNDERLINE, string, RESET);
    }

    public static String white_underline(String string) {
        return String.format("%s%s%s", WHITE_UNDERLINE, string, RESET);
    }

    public static String black_background(String string) {
        return String.format("%s%s%s", BLACK_BACKGROUND, string, RESET);
    }

    public static String red_background(String string) {
        return String.format("%s%s%s", RED_BACKGROUND, string, RESET);
    }

    public static String green_background(String string) {
        return String.format("%s%s%s", GREEN_BACKGROUND, string, RESET);
    }

    public static String yellow_background(String string) {
        return String.format("%s%s%s", YELLOW_BACKGROUND, string, RESET);
    }

    public static String blue_background(String string) {
        return String.format("%s%s%s", BLUE_BACKGROUND, string, RESET);
    }

    public static String purple_background(String string) {
        return String.format("%s%s%s", PURPLE_BACKGROUND, string, RESET);
    }

    public static String cyan_background(String string) {
        return String.format("%s%s%s", CYAN_BACKGROUND, string, RESET);
    }

    public static String white_background(String string) {
        return String.format("%s%s%s", WHITE_BACKGROUND, string, RESET);
    }

    public static String black_bright(String string) {
        return String.format("%s%s%s", BLACK_BRIGHT, string, RESET);
    }

    public static String red_bright(String string) {
        return String.format("%s%s%s", RED_BRIGHT, string, RESET);
    }

    public static String green_bright(String string) {
        return String.format("%s%s%s", GREEN_BRIGHT, string, RESET);
    }

    public static String yellow_bright(String string) {
        return String.format("%s%s%s", YELLOW_BRIGHT, string, RESET);
    }

    public static String blue_bright(String string) {
        return String.format("%s%s%s", BLUE_BRIGHT, string, RESET);
    }

    public static String purple_bright(String string) {
        return String.format("%s%s%s", PURPLE_BRIGHT, string, RESET);
    }

    public static String cyan_bright(String string) {
        return String.format("%s%s%s", CYAN_BRIGHT, string, RESET);
    }

    public static String white_bright(String string) {
        return String.format("%s%s%s", WHITE_BRIGHT, string, RESET);
    }

    public static String black_bold_bright(String string) {
        return String.format("%s%s%s", BLACK_BOLD_BRIGHT, string, RESET);
    }

    public static String red_bold_bright(String string) {
        return String.format("%s%s%s", RED_BOLD_BRIGHT, string, RESET);
    }

    public static String green_bold_bright(String string) {
        return String.format("%s%s%s", GREEN_BOLD_BRIGHT, string, RESET);
    }

    public static String yellow_bold_bright(String string) {
        return String.format("%s%s%s", YELLOW_BOLD_BRIGHT, string, RESET);
    }

    public static String blue_bold_bright(String string) {
        return String.format("%s%s%s", BLUE_BOLD_BRIGHT, string, RESET);
    }

    public static String purple_bold_bright(String string) {
        return String.format("%s%s%s", PURPLE_BOLD_BRIGHT, string, RESET);
    }

    public static String cyan_bold_bright(String string) {
        return String.format("%s%s%s", CYAN_BOLD_BRIGHT, string, RESET);
    }

    public static String white_bold_bright(String string) {
        return String.format("%s%s%s", WHITE_BOLD_BRIGHT, string, RESET);
    }

    public static String black_background_bright(String string) {
        return String.format("%s%s%s", BLACK_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String red_background_bright(String string) {
        return String.format("%s%s%s", RED_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String green_background_bright(String string) {
        return String.format("%s%s%s", GREEN_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String yellow_background_bright(String string) {
        return String.format("%s%s%s", YELLOW_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String blue_background_bright(String string) {
        return String.format("%s%s%s", BLUE_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String purple_background_bright(String string) {
        return String.format("%s%s%s", PURPLE_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String cyan_background_bright(String string) {
        return String.format("%s%s%s", CYAN_BACKGROUND_BRIGHT, string, RESET);
    }

    public static String white_background_bright(String string) {
        return String.format("%s%s%s", WHITE_BACKGROUND_BRIGHT, string, RESET);
    }
}
