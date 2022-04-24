package sample.itraund;



import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Text name;

    @FXML
    private Text about;

    @FXML
    private Button alpha;

    @FXML
    private Button amazon;

    @FXML
    private Button apple;

    @FXML
    private Button compBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Button micro;

    @FXML
    private Button mmaBtn;

    @FXML
    private Text money;

    @FXML
    private Button musicBtn;

    @FXML
    private ImageView picture;

    @FXML
    private Button saudi;

    @FXML
    void initialize() {
        compBtn.setOnAction(e -> {
            micro.setText("Microsoft");
            amazon.setText("Amazon Inc.");
            saudi.setText("Saudi Aramco");
            alpha.setText("Alphabet Inc.");
            apple.setText("Apple Inc.");
        micro.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                name.setText(" Microsoft");
                about.setText("На сегодняшний день Microsoft также является одним из лидеров на рынке программного обеспечения для ПК, выпуская операционные системы Windows нового поколения, прикладные приложения для работы с документацией — Microsoft Office, а также ряд других программ. Кроме того, MS выпускает собственные мобильные устройства и комплектующие, видео, аудио и оргтехнику.");
                money.setText("$2 311 млрд.");
            }
        });
        amazon.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                name.setText(" Amazon Inc.");
                about.setText("Amazon – это американская ритейл-компания, занимающаяся продажей и поставкой различных товаров через интернет. 7 января 2019, компания Амазон впервые стала самой дорогой компанией в мире, обогнав своего конкурента – Microsoft. Сейчас она занимает только 5 место.");
                money.setText("$1 460 млрд.");
            }
        });
        saudi.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                name.setText(" Saudi Aramco");
                about.setText("Компания Saudi Aramco (Saudi Arabian Oil Company) заявила о себе только в 2019 году, официально опубликовав финансовые отчеты за 2018 год. Сразу после выхода акций на фондовую биржу Tadawul её стоимость достигла почти 1,9 триллиона долларов, что позволило ей стать самой крупной компанией мира по рыночной стоимости.");
                money.setText("$1 870 млрд.");
            }
        });
        alpha.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                name.setText(" Alphabet Inc.");
                about.setText("Известная на весь мир интернет компания Гугл с недавних пор изменила своё официальное наименования на Alphabet, поскольку компания давно вышла за рамки одного поисковика Google, а также владеет множеством других компаний.");
                money.setText("$1 770 млрд.");
            }
        });
        apple.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                name.setText(" Apple Inc.");
                about.setText("В январе 2022 года рыночная капитализация Apple превысила порог в 2.7 триллиона долларов, и сегодня компания занимает первое место как самая дорогая компания в мире.");
                money.setText("$2 780 млрд.");
            }
        });});
        musicBtn.setOnAction(e -> {
            micro.setText("Пол Маккартни");
            amazon.setText("Мадонна");
            saudi.setText("Селин Дион");
            alpha.setText("Боно");
            apple.setText("Долли Партон");
            micro.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Пол Маккартни");
                    about.setText("Сэр Джеймс Пол Макка́ртни — британский музыкант, мультиинструменталист, писатель и продюсер. Один из основателей группы The Beatles, 16-кратный обладатель премии «Грэмми», рыцарь-бакалавр и кавалер ордена Британской империи.");
                    money.setText("$1.2 млрд.");
                }
            });
            amazon.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Мадонна");
                    about.setText("Мадонна Луиз Чикконе — американская автор-исполнительница, поп-певица, танцовщица, музыкальный продюсер, а также актриса, режиссёр и детская писательница. Самая коммерчески успешная исполнительница в истории по версии «Книги рекордов Гиннесса».");
                    money.setText("$850 млн");
                }
            });
            saudi.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Селин Дион");
                    about.setText("Селин Мари Клодетт Дион — канадская певица, автор песен, актриса и композитор. Родившаяся в многодетной семье в провинции Квебек, Дион в подростковом возрасте стала звездой во франкоязычном мире после того, как её менеджер и будущий муж Рене Анжелил заложил свой дом, чтобы профинансировать её первую запись.");
                    money.setText("$800 млн");
                }
            });
            alpha.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Боно");
                    about.setText("Пол Дэ́вид Хью́сон, известный под псевдонимом Бо́но, — ирландский автор-исполнитель, музыкант и филантроп. Лид-вокалист рок-группы U2.");
                    money.setText("$700 млн.");
                }
            });
            apple.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Долли Партон.");
                    about.setText("До́лли Ребе́кка Па́ртон — американская кантри-певица и киноактриса, которая написала более шестисот песен и двадцать пять раз поднималась на верхнюю позицию кантри-чартов журнала «Биллборд». У себя на родине признана одной из самых успешных певиц в своём жанре, получив при этом титул «Королева кантри».");
                    money.setText("$650 млн.");
                }
            });});
        mmaBtn.setOnAction(e -> {
            apple.setText("Сауль Альварес");
            micro.setText("Флойд Мейвезер");
            saudi.setText("Конор Макгрегор");
            alpha.setText("Джейк Пол");
            amazon.setText("Логан Пол");

            apple.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Сауль Альварес");
                    about.setText("Для кого-то мексиканец – герой года, для кого-то антигерой, для третьих вовсе читер. Но факт остаётся фактом — в плане заработка и популярности он сейчас номер один в мире единоборств. Одна лишь армия мексиканских болельщиков готова платить за просмотр и посещение его поединков огромные суммы. Всё это привело к тому, что Канело задвинул самого Мейвезера, который зачастую возглавляет подобные рейтинги. В 2021 году Сауль Альварес провёл три поединка, которые в сумме принесли ему почти $ 100 млн.");
                    money.setText("$88,6 млн.");
                }
            });
            micro.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Флойд Мейвезер");
                    about.setText("Флойд даже в свои 44 умудряется генерировать десятки миллионов долларов. В 2021 году он провёл один-единственный поединок, да и тот выставочный. Но как же Мейвезер умеет раскручивать и продавать бои. Казалось, никому не интересный со спортивной точки зрения поединок с Логаном Полом посмотрят очень немногие. Но харизма Флойда продолжает работать в США и принесла ему очередной баснословный гонорар. С учётом этого, не стоит удивляться, что Мейвезер никак не угомонится, уж очень легко ему даются миллионы, отказаться от такого сложно.");
                    money.setText("$ 65,07 млн.");
                }
            });
            saudi.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Конор Макгрегор");
                    about.setText("Конор приносит колоссальные доходы UFC, потому лига продолжает делать вид, что верит в экс-чемпиона лиги в двух дивизионах. Что и говорить, если за два поражения в 2021 году (оба от Дастина Порье) Макгрегор заработал почти полсотни миллионов. Удивительно, но, невзирая на то, что Конор чисто по спортивным показателям уже давно не элитный боец, интерес к нему не угасает. Магия ирландца потрясает. Болельщики уже ждут его возвращения в клетку в 2022 году и точно будут готовы платить за просмотр его схваток.");
                    money.setText("$49,1 млн.");
                }
            });
            alpha.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Джейк Пол");
                    about.setText("В третьем в году бою Пол должен был встретиться с настоящим боксёром – Томми Фьюри. Но у того возникли проблемы со здоровьем, и на замену ему согласился выйти Тайрон Вудли. На этот раз Пол нокаутировал экс-чемпиона UFC. За все эти подвиги Джейк заработал $ 41,6 млн.");
                    money.setText("$41,6 млн.");
                }
            });
            amazon.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {
                    name.setText(" Логан Пол");
                    about.setText("Логан Пол в 2021 году провёл один поединок. Но какой! В соперники ему достался самый денежный боксёр в истории, экс-чемпион мира в пяти весовых категориях Флойд Мейвезер. Так что немудрено, что за схватку с ним Логан получил такую сумму. Естественно, большая часть её приходится на систему PPV.");
                    money.setText("$20,2 млн.");
                }
            });
            });
        exitBtn.setOnAction(e -> {
            Stage stage = (Stage) exitBtn.getScene().getWindow();
            stage.close();
        });



    }


}
