class Ansi:
    RESET: str = "\033[0m"
    BLACK: str = "\033[030m"
    RED: str = "\033[031m"
    GREEN: str = "\033[032m"
    YELLOW: str = "\033[033m"
    BLUE: str = "\033[034m"
    PURPLE: str = "\033[035m"
    CYAN: str = "\033[036m"
    WHITE: str = "\033[037m"
    BLACK_BOLD: str = "\033[130m"
    RED_BOLD: str = "\033[131m"
    GREEN_BOLD: str = "\033[132m"
    YELLOW_BOLD: str = "\033[133m"
    BLUE_BOLD: str = "\033[134m"
    PURPLE_BOLD: str = "\033[135m"
    CYAN_BOLD: str = "\033[136m"
    WHITE_BOLD: str = "\033[137m"
    BLACK_UNDERLINE: str = "\033[430m"
    RED_UNDERLINE: str = "\033[431m"
    GREEN_UNDERLINE: str = "\033[432m"
    YELLOW_UNDERLINE: str = "\033[433m"
    BLUE_UNDERLINE: str = "\033[434m"
    PURPLE_UNDERLINE: str = "\033[435m"
    CYAN_UNDERLINE: str = "\033[436m"
    WHITE_UNDERLINE: str = "\033[437m"
    BLACK_BACKGROUND: str = "\033[40m"
    RED_BACKGROUND: str = "\033[41m"
    GREEN_BACKGROUND: str = "\033[42m"
    YELLOW_BACKGROUND: str = "\033[43m"
    BLUE_BACKGROUND: str = "\033[44m"
    PURPLE_BACKGROUND: str = "\033[45m"
    CYAN_BACKGROUND: str = "\033[46m"
    WHITE_BACKGROUND: str = "\033[47m"
    BLACK_BRIGHT: str = "\033[090m"
    RED_BRIGHT: str = "\033[091m"
    GREEN_BRIGHT: str = "\033[092m"
    YELLOW_BRIGHT: str = "\033[093m"
    BLUE_BRIGHT: str = "\033[094m"
    PURPLE_BRIGHT: str = "\033[095m"
    CYAN_BRIGHT: str = "\033[096m"
    WHITE_BRIGHT: str = "\033[097m"
    BLACK_BOLD_BRIGHT: str = "\033[190m"
    RED_BOLD_BRIGHT: str = "\033[191m"
    GREEN_BOLD_BRIGHT: str = "\033[192m"
    YELLOW_BOLD_BRIGHT: str = "\033[193m"
    BLUE_BOLD_BRIGHT: str = "\033[194m"
    PURPLE_BOLD_BRIGHT: str = "\033[195m"
    CYAN_BOLD_BRIGHT: str = "\033[196m"
    WHITE_BOLD_BRIGHT: str = "\033[197m"
    BLACK_BACKGROUND_BRIGHT: str = "\033[0100m"
    RED_BACKGROUND_BRIGHT: str = "\033[0101m"
    GREEN_BACKGROUND_BRIGHT: str = "\033[0102m"
    YELLOW_BACKGROUND_BRIGHT: str = "\033[0103m"
    BLUE_BACKGROUND_BRIGHT: str = "\033[0104m"
    PURPLE_BACKGROUND_BRIGHT: str = "\033[0105m"
    CYAN_BACKGROUND_BRIGHT: str = "\033[0106m"
    WHITE_BACKGROUND_BRIGHT: str = "\033[0107m"

    @staticmethod
    def black(string: str) -> str:
        return f'{Ansi.BLACK}{string}{Ansi.RESET}'
    
    @staticmethod
    def red(string: str) -> str:
        return f'{Ansi.RED}{string}{Ansi.RESET}'
    
    @staticmethod
    def green(string: str) -> str:
        return f'{Ansi.GREEN}{string}{Ansi.RESET}'
    
    @staticmethod
    def yellow(string: str) -> str:
        return f'{Ansi.YELLOW}{string}{Ansi.RESET}'
    
    @staticmethod
    def blue(string: str) -> str:
        return f'{Ansi.BLUE}{string}{Ansi.RESET}'
    
    @staticmethod
    def purple(string: str) -> str:
        return f'{Ansi.PURPLE}{string}{Ansi.RESET}'
    
    @staticmethod
    def cyan(string: str) -> str:
        return f'{Ansi.CYAN}{string}{Ansi.RESET}'
    
    @staticmethod
    def white(string: str) -> str:
        return f'{Ansi.WHITE}{string}{Ansi.RESET}'
    
    @staticmethod
    def blackBold(string: str) -> str:
        return f'{Ansi.BLACK_BOLD}{string}{Ansi.RESET}'
    
    @staticmethod
    def redBold(string: str) -> str:
        return f'{Ansi.RED_BOLD}{string}{Ansi.RESET}'
    
    @staticmethod
    def greenBold(string: str) -> str:
        return f'{Ansi.GREEN_BOLD}{string}{Ansi.RESET}'
    
    @staticmethod
    def yellowBold(string: str) -> str:
        return f'{Ansi.YELLOW_BOLD}{string}{Ansi.RESET}'
    
    @staticmethod
    def blueBold(string: str) -> str:
        return f'{Ansi.BLUE_BOLD}{string}{Ansi.RESET}'
    
    @staticmethod
    def purpleBold(string: str) -> str:
        return f'{Ansi.PURPLE_BOLD}{string}{Ansi.RESET}'
    
    @staticmethod
    def cyanBold(string: str) -> str:
        return f'{Ansi.CYAN_BOLD}{string}{Ansi.RESET}'
    
    @staticmethod
    def whiteBold(string: str) -> str:
        return f'{Ansi.WHITE_BOLD}{string}{Ansi.RESET}'
    
    @staticmethod
    def blackUnderline(string: str) -> str:
        return f'{Ansi.BLACK_UNDERLINE}{string}{Ansi.RESET}'
    
    @staticmethod
    def redUnderline(string: str) -> str:
        return f'{Ansi.RED_UNDERLINE}{string}{Ansi.RESET}'
    
    @staticmethod
    def greenUnderline(string: str) -> str:
        return f'{Ansi.GREEN_UNDERLINE}{string}{Ansi.RESET}'
    
    @staticmethod
    def yellowUnderline(string: str) -> str:
        return f'{Ansi.YELLOW_UNDERLINE}{string}{Ansi.RESET}'
    
    @staticmethod
    def blueUnderline(string: str) -> str:
        return f'{Ansi.BLUE_UNDERLINE}{string}{Ansi.RESET}'
    
    @staticmethod
    def purpleUnderline(string: str) -> str:
        return f'{Ansi.PURPLE_UNDERLINE}{string}{Ansi.RESET}'
    
    @staticmethod
    def cyanUnderline(string: str) -> str:
        return f'{Ansi.CYAN_UNDERLINE}{string}{Ansi.RESET}'
    
    @staticmethod
    def whiteUnderline(string: str) -> str:
        return f'{Ansi.WHITE_UNDERLINE}{string}{Ansi.RESET}'
    
    @staticmethod
    def blackBackground(string: str) -> str:
        return f'{Ansi.BLACK_BACKGROUND}{string}{Ansi.RESET}'
    
    @staticmethod
    def redBackground(string: str) -> str:
        return f'{Ansi.RED_BACKGROUND}{string}{Ansi.RESET}'
    
    @staticmethod
    def greenBackground(string: str) -> str:
        return f'{Ansi.GREEN_BACKGROUND}{string}{Ansi.RESET}'
    
    @staticmethod
    def yellowBackground(string: str) -> str:
        return f'{Ansi.YELLOW_BACKGROUND}{string}{Ansi.RESET}'
    
    @staticmethod
    def blueBackground(string: str) -> str:
        return f'{Ansi.BLUE_BACKGROUND}{string}{Ansi.RESET}'
    
    @staticmethod
    def purpleBackground(string: str) -> str:
        return f'{Ansi.PURPLE_BACKGROUND}{string}{Ansi.RESET}'
    
    @staticmethod
    def cyanBackground(string: str) -> str:
        return f'{Ansi.CYAN_BACKGROUND}{string}{Ansi.RESET}'
    
    @staticmethod
    def whiteBackground(string: str) -> str:
        return f'{Ansi.WHITE_BACKGROUND}{string}{Ansi.RESET}'
    
    @staticmethod
    def blackBright(string: str) -> str:
        return f'{Ansi.BLACK_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def redBright(string: str) -> str:
        return f'{Ansi.RED_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def greenBright(string: str) -> str:
        return f'{Ansi.GREEN_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def yellowBright(string: str) -> str:
        return f'{Ansi.YELLOW_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def blueBright(string: str) -> str:
        return f'{Ansi.BLUE_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def purpleBright(string: str) -> str:
        return f'{Ansi.PURPLE_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def cyanBright(string: str) -> str:
        return f'{Ansi.CYAN_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def whiteBright(string: str) -> str:
        return f'{Ansi.WHITE_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def blackBoldBright(string: str) -> str:
        return f'{Ansi.BLACK_BOLD_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def redBoldBright(string: str) -> str:
        return f'{Ansi.RED_BOLD_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def greenBoldBright(string: str) -> str:
        return f'{Ansi.GREEN_BOLD_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def yellowBoldBright(string: str) -> str:
        return f'{Ansi.YELLOW_BOLD_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def blueBoldBright(string: str) -> str:
        return f'{Ansi.BLUE_BOLD_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def purpleBoldBright(string: str) -> str:
        return f'{Ansi.PURPLE_BOLD_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def cyanBoldBright(string: str) -> str:
        return f'{Ansi.CYAN_BOLD_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def whiteBoldBright(string: str) -> str:
        return f'{Ansi.WHITE_BOLD_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def blackBackgroundBright(string: str) -> str:
        return f'{Ansi.BLACK_BACKGROUND_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def redBackgroundBright(string: str) -> str:
        return f'{Ansi.RED_BACKGROUND_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def greenBackgroundBright(string: str) -> str:
        return f'{Ansi.GREEN_BACKGROUND_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def yellowBackgroundBright(string: str) -> str:
        return f'{Ansi.YELLOW_BACKGROUND_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def blueBackgroundBright(string: str) -> str:
        return f'{Ansi.BLUE_BACKGROUND_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def purpleBackgroundBright(string: str) -> str:
        return f'{Ansi.PURPLE_BACKGROUND_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def cyanBackgroundBright(string: str) -> str:
        return f'{Ansi.CYAN_BACKGROUND_BRIGHT}{string}{Ansi.RESET}'
    
    @staticmethod
    def whiteBackgroundBright(string: str) -> str:
        return f'{Ansi.WHITE_BACKGROUND_BRIGHT}{string}{Ansi.RESET}'
    