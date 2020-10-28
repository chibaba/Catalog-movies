package com.example.genremoviesincinema;

import com.example.genremoviesincinema.ui.gallery.MovieData;

import java.util.ArrayList;
import java.util.List;

public class MovieSheet {
    List<MovieData> actionMovieList = new ArrayList<>();
    List<MovieData> fantasyMovieList = new ArrayList<>();
    List<MovieData> dramaMovieList = new ArrayList<>();

    public MovieSheet(){
        actionGenerator();
        fanasyGenerator();
        romanceGenerator();
    }


    public void actionGenerator(){
        MovieData one = new MovieData("Fandora",2004,"https://assets3.thrillist.com/v1/image/2897945/1584x1056/crop;jpeg_quality=60;progressive.jpg","With F9 the next chapter in the NOS-powered Fast and Furious saga pushed to 2021 because of the outbreak" +
                " of the coronavirus, Vin Diesel fans will have to make due with Bloodshot, a frenzied adaptation of a popular Valiant Comics title first published in the '90s." +
                " Like many non-Fast thrillers from Diesel, the results are a mixed bag, emphasizing the star's muscular frame",
                "Movieone", 3.00f);
        actionMovieList.add(one);
        MovieData two = new MovieData("Quiet hangs",2020,"https://assets3.thrillist.com/v1/image/2115301/1584x1054/crop;jpeg_quality=60.jpg","A sequel to 2018's Walter Hill-like throwback The Debt Collector, which found the reliably bruising Scott Adkins playing a reluctant mob " +
                "bagman named French, this buddy action comedy occasionally fails to pay up", "Quiet Holigang", 3.45f);
        actionMovieList.add(two);

        MovieData three = new MovieData("Strike-Back",2019,"https://assets3.thrillist.com/v1/image/2882144/1584x1054/crop;jpeg_quality=60.jpg","After battling her way through an apocalyptic desert wasteland in Mad Max: Fury Road, punching her way" +
                " through Berlin in Atomic Blonde, and tangling in the sky with the Fast and Furious crew, Charlize Theron gets her own superhero franchise with this curious " +
                "adaptation of Greg Rucka's comic series focussed on a rag-tag group un-killable mercenaries","strike", 4.10f);
        actionMovieList.add(three);

        MovieData four = new MovieData("Conraction",2012,"https://assets3.thrillist.com/v1/image/2339863/1584x1054/crop;jpeg_quality=60.jpg","Tossing aside Thor's massive hammer and trimming his gnarly Avengers: Endgame beard, Chris Hemsworth picks up " +
                "an assault rifle and gets to work in Extraction, a new Netflix shoot-em-up that re-teams the Australian actor with his former Marvel filmmaking buddies " +
                "Joe and Anthony Russo,","contraction", 4.56f);
        actionMovieList.add(four);

        MovieData five = new MovieData("Contract on Her Name",2000,"https://assets3.thrillist.com/v1/image/2866018/1584x3000/scale;jpeg_quality=60.jpg","At less than 90 minutes, this dread-soaked, Southern-fried neo-noir doesn't waste time turning the screws on" +
                " its put-upon protagonist. Leigh (Bethany Anne Lind) is introduced having recently survived an attack and possibly killed a man lying dead on the floor" +
                " of her garage. She knows exactly what happened; the viewer is kept in the dar", "five", 5.00f);
        actionMovieList.add(five);

        MovieData six = new MovieData("Lost Homeless",2020, "https://assets3.thrillist.com/v1/image/1895303/1584x1054/crop;jpeg_quality=60.jpg","Alban Lenoir, the star and co-writer of this proudly sturdy French thriller, has a rugged-yet-droll Statham-like quality," +
                " that rogue-like charisma that never reads as desperation. He plays Lino, a hapless thief who turns into an unlikely car mechanic for the police," +
                " and he spends most of the movie attempting to clear his name for a murder he didn't commit.", "seven", 3.33f);
        actionMovieList.add(six);

        MovieData seven = new MovieData(" Predators",2020, "https://assets3.thrillist.com/v1/image/2865088/1584x3000/scale;jpeg_quality=60.jpg","Birds of Prey, the recently retitledSuicide Squad spin-off starring  Margot Robbie's joyfully defiant Harley Quinn, " +
                "didn't exactly light up the box office in the same way last year's Oscar-nominated Joker movie did, but it's a lot more fun.", "dert", 1.23f
                );
        actionMovieList.add(seven);

        MovieData eight= new MovieData("TimetoHunt",2000, "https://assets3.thrillist.com/v1/image/2776429/1584x3000/scale;jpeg_quality=60.jpg","Unrelenting in its pursuit of scenarios where guys point big guns at each other in sparsely lit empty hallways, Time " +
                "to Hunt is a South Korean thriller that knows exactly what stylistic register it's playing in. A group of four friends, including Parasite and Train" +
                " to Busan break-out Choi Woo-shik, knock over a gambling house", "timetohunt", 3.56f);
        actionMovieList.add(eight);

        MovieData nine = new MovieData("BaD Gang",5, "https://assets3.thrillist.com/v1/image/2864988/1584x3000/scale;jpeg_quality=60.jpg", "In what hasn't exactly been a great year for action movies so far, Bad Boys for Life has to be the biggest surprise." +
                " Given its lengthy production history, its January release date, and the departure of series director Michael Bay -- the action auteur gets a winking cameo here, " +
                "perhaps taking a break from shooting Netflix's 6 Underground -- this movie could've been a disaster", "bad gang", 2.35f);
        actionMovieList.add(nine);

        MovieData ten = new MovieData("MuLANA",1998,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","The latest installment in Disney’s never-ending list of live-action remakes of animated classics was " +
                "scheduled to hit theaters on March 27, but it was postponed until late July due to the coronavirus pandemic—but it looks like it'll be worth the wait. While this" +
                " version doesn't have a talking dragon sidekick or multiple song-and dance-breaks, Mulan appears to be even more of a badass now than she was in 1998.", "MUKAILA", 3.56F
                );
        actionMovieList.add(ten);

        MovieData eleven = new MovieData("WAKANDA Woman 1984",2012,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","After the (much-deserved) massive success of 2017’s Wonder Woman, it makes sense that " +
                "director Patty Jenkins and star Gal Gadot would dive immediately back into the sequel. It’ll be out later this summer, with Wonder Woman going head-to-head with " +
                "Kristen Wiig’s villainous Cheetah. Though it looked like Chris Pine’s role as Steve Trevor came to an end at the close of the first film, he does make an appearance" +
                " in the sequel’s trailer, and that, combined with the fact that superhero movies play by no one’s rules, means anything could happen come August 14.","WAKANDA WOMANA", 2.45f);
        actionMovieList.add(eleven);

        MovieData twelve = new MovieData("Black Widow",2003,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","Since Scarlett Johansson’s Black Widow, a.k.a. Natasha Romanoff, first entered the Marvel Universe" +
                " in Iron Man 2, the world has been holding its breath for a standalone movie. Those dreams will finally come true this year, as Black Widow is backed by her family–played b" +
                "y Florence Pugh, Rachel Weisz, and David Harbour–on a mission to settle some unfinished business buried deep in her past.","Black widow", 3.5f);
        actionMovieList.add(twelve);

        MovieData thirteen = new MovieData("No Time to Die",2010,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","James Bond has a bit of a sexism problem, but the 25th installment in the British spy series " +
                "already looks to be miles ahead of its predecessors due to the fact that it was co-written by Killing Eve creator Phoebe Waller-Bridge and features a theme song performed " +
                "by Billie Eilish. We can’t wait to see 007 go full Fleabag–but who will play his Hot Priest?!","first", 3.56f);
        actionMovieList.add(thirteen);

        MovieData fourteen = new MovieData("The Eternals",2000,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Just when you thought Marvel couldn’t find any more huge stars to join its cinematic universe... " +
                "That’s right, Angelina Jolie and Salma Hayek are now Avengers-adjacent, as are half the Stark children and, of course, #RippedKumailNanjiani. Almost all of them will play " +
                "members of the titular alien race, who are working together to protect Earth from the Deviants, sworn enemies of the Eternals. Welcome to the next phase of the Marvel un" +
                "iverse.", "eternals", 2.34f);
        actionMovieList.add(fourteen);

        MovieData fifteen = new MovieData("Gunners: Maverick",2014,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Apparently, there’s no such thing as “too long” to wait between franchise installments" +
                ". Thirty-four years after the original Top Gun, Tom Cruise will reprise his role as Navy aviator Maverick. According to the official plot synopsis, he’ll be confronting" +
                " ghosts from his past while leading a team of pilot trainees on a highly dangerous mission–should they choose to accept it. (Oops, wrong Tom Cruise franchise.)","Gunners", 3.55f);
        actionMovieList.add(fifteen);
    }

    public void fanasyGenerator() {
        MovieData one = new MovieData("Fandora",2014,"https://assets3.thrillist.com/v1/image/1197945/1584x1056/crop;jpeg_quality=60;progressive.jpg","With F9 the next chapter in the NOS-powered Fast and Furious saga pushed to 2021 because of the outbreak" +
                " of the coronavirus, Vin Diesel fans will have to make due with Bloodshot, a frenzied adaptation of a popular Valiant Comics title first published in the '90s." +
                " Like many non-Fast thrillers from Diesel, the results are a mixed bag, emphasizing the star's muscular frame",
                "Movieone", 3.00f);
        fantasyMovieList.add(one);
        MovieData two = new MovieData("Fantasy hangs",2020,"https://assets3.thrillist.com/v1/image/2110301/1584x1054/crop;jpeg_quality=60.jpg","A sequel to 2018's Walter Hill-like throwback The Debt Collector, which found the reliably bruising Scott Adkins playing a reluctant mob " +
                "bagman named French, this buddy action comedy occasionally fails to pay up", "Quiet Holigang", 3.45f);
        actionMovieList.add(two);

        MovieData three = new MovieData("Strike-Back",2019,"https://assets3.thrillist.com/v1/image/2882144/1584x1054/crop;jpeg_quality=60.jpg","After battling her way through an apocalyptic desert wasteland in Mad Max: Fury Road, punching her way" +
                " through Berlin in Atomic Blonde, and tangling in the sky with the Fast and Furious crew, Charlize Theron gets her own superhero franchise with this curious " +
                "adaptation of Greg Rucka's comic series focussed on a rag-tag group un-killable mercenaries","strike", 4.10f);
        actionMovieList.add(three);

        MovieData four = new MovieData("Conraction",2012,"https://assets3.thrillist.com/v1/image/2339863/1584x1054/crop;jpeg_quality=60.jpg","Tossing aside Thor's massive hammer and trimming his gnarly Avengers: Endgame beard, Chris Hemsworth picks up " +
                "an assault rifle and gets to work in Extraction, a new Netflix shoot-em-up that re-teams the Australian actor with his former Marvel filmmaking buddies " +
                "Joe and Anthony Russo,","contraction", 4.56f);
        actionMovieList.add(four);

        MovieData five = new MovieData("Contract on Her Name",2000,"https://assets3.thrillist.com/v1/image/2866018/1584x3000/scale;jpeg_quality=60.jpg","At less than 90 minutes, this dread-soaked, Southern-fried neo-noir doesn't waste time turning the screws on" +
                " its put-upon protagonist. Leigh (Bethany Anne Lind) is introduced having recently survived an attack and possibly killed a man lying dead on the floor" +
                " of her garage. She knows exactly what happened; the viewer is kept in the dar", "five", 5.00f);
        actionMovieList.add(five);

        MovieData six = new MovieData("Lost Homeless",2020, "https://assets3.thrillist.com/v1/image/1895303/1584x1054/crop;jpeg_quality=60.jpg","Alban Lenoir, the star and co-writer of this proudly sturdy French thriller, has a rugged-yet-droll Statham-like quality," +
                " that rogue-like charisma that never reads as desperation. He plays Lino, a hapless thief who turns into an unlikely car mechanic for the police," +
                " and he spends most of the movie attempting to clear his name for a murder he didn't commit.", "seven", 3.33f);
        actionMovieList.add(six);

        MovieData seven = new MovieData(" Predators",2020, "https://assets3.thrillist.com/v1/image/2865088/1584x3000/scale;jpeg_quality=60.jpg","Birds of Prey, the recently retitledSuicide Squad spin-off starring  Margot Robbie's joyfully defiant Harley Quinn, " +
                "didn't exactly light up the box office in the same way last year's Oscar-nominated Joker movie did, but it's a lot more fun.", "dert", 1.23f
        );
        actionMovieList.add(seven);

        MovieData eight= new MovieData("TimetoHunt",2000, "https://assets3.thrillist.com/v1/image/2776429/1584x3000/scale;jpeg_quality=60.jpg","Unrelenting in its pursuit of scenarios where guys point big guns at each other in sparsely lit empty hallways, Time " +
                "to Hunt is a South Korean thriller that knows exactly what stylistic register it's playing in. A group of four friends, including Parasite and Train" +
                " to Busan break-out Choi Woo-shik, knock over a gambling house", "timetohunt", 3.56f);
        actionMovieList.add(eight);

        MovieData nine = new MovieData("BaD Gang",5, "https://assets3.thrillist.com/v1/image/2864988/1584x3000/scale;jpeg_quality=60.jpg", "In what hasn't exactly been a great year for action movies so far, Bad Boys for Life has to be the biggest surprise." +
                " Given its lengthy production history, its January release date, and the departure of series director Michael Bay -- the action auteur gets a winking cameo here, " +
                "perhaps taking a break from shooting Netflix's 6 Underground -- this movie could've been a disaster", "bad gang", 2.35f);
        actionMovieList.add(nine);

        MovieData ten = new MovieData("MuLANA",1998,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","The latest installment in Disney’s never-ending list of live-action remakes of animated classics was " +
                "scheduled to hit theaters on March 27, but it was postponed until late July due to the coronavirus pandemic—but it looks like it'll be worth the wait. While this" +
                " version doesn't have a talking dragon sidekick or multiple song-and dance-breaks, Mulan appears to be even more of a badass now than she was in 1998.", "MUKAILA", 3.56F
        );
        actionMovieList.add(ten);

        MovieData eleven = new MovieData("WAKANDA Woman 1984",2012,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","After the (much-deserved) massive success of 2017’s Wonder Woman, it makes sense that " +
                "director Patty Jenkins and star Gal Gadot would dive immediately back into the sequel. It’ll be out later this summer, with Wonder Woman going head-to-head with " +
                "Kristen Wiig’s villainous Cheetah. Though it looked like Chris Pine’s role as Steve Trevor came to an end at the close of the first film, he does make an appearance" +
                " in the sequel’s trailer, and that, combined with the fact that superhero movies play by no one’s rules, means anything could happen come August 14.","WAKANDA WOMANA", 2.45f);
        actionMovieList.add(eleven);

        MovieData twelve = new MovieData("Black Widow",2003,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","Since Scarlett Johansson’s Black Widow, a.k.a. Natasha Romanoff, first entered the Marvel Universe" +
                " in Iron Man 2, the world has been holding its breath for a standalone movie. Those dreams will finally come true this year, as Black Widow is backed by her family–played b" +
                "y Florence Pugh, Rachel Weisz, and David Harbour–on a mission to settle some unfinished business buried deep in her past.","Black widow", 3.5f);
        actionMovieList.add(twelve);

        MovieData thirteen = new MovieData("No Time to Die",2010,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ww-1984-warner-1585834209.jpg?crop=1.00xw:0.801xh;0,0.0150xh&resize=768:*","James Bond has a bit of a sexism problem, but the 25th installment in the British spy series " +
                "already looks to be miles ahead of its predecessors due to the fact that it was co-written by Killing Eve creator Phoebe Waller-Bridge and features a theme song performed " +
                "by Billie Eilish. We can’t wait to see 007 go full Fleabag–but who will play his Hot Priest?!","first", 3.56f);
        actionMovieList.add(thirteen);

        MovieData fourteen = new MovieData("The Eternals",2000,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Just when you thought Marvel couldn’t find any more huge stars to join its cinematic universe... " +
                "That’s right, Angelina Jolie and Salma Hayek are now Avengers-adjacent, as are half the Stark children and, of course, #RippedKumailNanjiani. Almost all of them will play " +
                "members of the titular alien race, who are working together to protect Earth from the Deviants, sworn enemies of the Eternals. Welcome to the next phase of the Marvel un" +
                "iverse.", "eternals", 2.34f);
        actionMovieList.add(fourteen);

        MovieData fifteen = new MovieData("Gunners: Maverick",2014,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/67334917-10157314311827488-1938253040570073088-o-0-1585754443.jpg?resize=768:*","Apparently, there’s no such thing as “too long” to wait between franchise installments" +
                ". Thirty-four years after the original Top Gun, Tom Cruise will reprise his role as Navy aviator Maverick. According to the official plot synopsis, he’ll be confronting" +
                " ghosts from his past while leading a team of pilot trainees on a highly dangerous mission–should they choose to accept it. (Oops, wrong Tom Cruise franchise.)","Gunners", 3.55f);
        actionMovieList.add(fifteen);

    }

    public void romanceGenerator(){

        Movie one = new Movie("Weathering With You",3,2020,"Anime’s king of feels Makoto Shinkai conquered the world in 2016 with his body-swap romance Your Name, a massive global hit that’s (of course) set for" +
                "an American remake. So it’s not a surprise that he’s stayed in similar teen-fantasy-romance territory for his follow-up, about a young runaway to Tokyo and the orphaned girl he falls in love with — a girl with the power " +
                "to bring the sun out, however briefly. What is surprising is the moodiness of Weathering With You, a love story for an era of climate change that staunchly refuses the idea that the young have to sacrifice themselves on " +
                "the altar of the decisions of previous generations. It’s darker and less deliriously swoony than Your Name, but its emotions are just as big — big enough to change the course of the future.","https://pyxis.nymag.com/v1/imgs/a35/319/573770d8b3de5c8392b9246a7d4eb9c141-15-weathering-with-you-2.rhorizontal.w700.jpg");
        dramaMovieList.add(one);

        Movie two = new Movie("Color Out of Space",4,2018,"Look, all you really need to know about this trippy H.P. Lovecraft update is that Nicolas Cage stars as a husband, father, and would-be farmer" +
                " who owns and does a lot of shouting about alpacas. Or maybe what’s most important is that this throwback horror freak-out is the work of filmmaker Richard Stanley, making a long-in-the-works comeback over two decades" +
                " after he was famously fired from the disaster that was The Island of Dr. Moreau. Either way, rest assured that things start going very poorly for the ill-fated family at its center, not to mention their animals, when " +
                "a meteor crash-lands on their rural property and starts warping reality around it.","https://pyxis.nymag.com/v1/imgs/053/73c/dda7e5796b67c5e312fc5b85aa0b367dd9-color-out-of-space.rhorizontal.w700.jpg");
        dramaMovieList.add(two);

        Movie three = new Movie("The Assistant",5,2019,"Director Kitty Green’s scripted debut depicts a long day in the life of a low-level drone at an unnamed New York film studio not unlike the Weinstein Company." +
                " Jane (Julia Garner) takes calls and makes copy and scrubs the bodily fluids off the couch in her boss’ office, all with the same look of grim understanding that this is what she has to endure to get ahead in her dream industry. " +
                "Spare and devastating, The Assistant serves up a portrait of an abusive workplace in which the behavior of the unseen man at its head trickles down to inform the power dynamics and behavior of the rest of the company." +
                " That includes HR, to which Jane pays a visit in a brutal centerpiece scene that emphasizes what it’s like when the only choices open seem to be to become complicit or to give up.","https://pyxis.nymag.com/v1/imgs/7c3/4af/68e90dd61b563b6611a8a06416d3f20757-05-the-assistant.rhorizontal.w700.jpg");
        dramaMovieList.add(three);

        Movie four = new Movie("The Whistlers",5,2020,"Romanian director Corneliu Porumboiu loves to play with procedure and form; he’s an ideal director for playful tales about bureaucrats, cops, and " +
                "other officials in a country still wrestling with the decades-long fallout from a communist dictatorship. His movies are cosmic comedies shot through with moments of ironic tragedy, and this crime comedy-drama might" +
                " be his weirdest one yet. It starts off as a bizarro tale about a policeman who has to learn a “whistling” language used by the inhabitants of one of the Canary Islands in order to help free a gangster from prison, " +
                "then twists into a moving meditation on love, loyalty, and self-improvement. Best experienced without knowing anything beforehand; I’ve already said too much!","https://pyxis.nymag.com/v1/imgs/611/ec2/21d4ae85681a205283e4f1f3ba53b09d7c-03-the-whistlers.rhorizontal.w700.jpg");
        dramaMovieList.add(four);

        Movie five = new Movie("Beanpole",4,2020,"Russian director Kantemir Balagov’s soul-crushingly powerful and exquisitely mounted historical drama (which really deserved at least an Oscar nomination" +
                " this year; it was short-listed but didn’t make the final five) follows two female veterans trying to reconnect with life in postwar St. Petersburg. It starts off in unspeakable tragedy — the young director is known for" +
                " booby-trapping his films with the occasionally devastating image or plot development — which makes for a striking emotional and structural gambit. As the characters wrestle with their own trauma, we, too, are dealing " +
                "with the consequences of what we’ve seen. What makes it all work — and work so beautifully — is Balagov’s almost supernatural command of film language: the elegance of his storytelling, the vivid, symbolic use of color," +
                " the humanism of the performances. You can bask in Beanpole’s cinematic delights while simultaneously having your heart ripped to shreds.","https://pyxis.nymag.com/v1/imgs/4f1/1bc/9c0b8518023db8f8ff3a3eb98d7397605a-10-beanpole.rhorizontal.w700.jpg");
        dramaMovieList.add(five);

        Movie six = new Movie("Sorry We Missed You",4,2020,"We wish we could have been a fly on the wall when Ken Loach — Britain’s foremost cinematic chronicler of working-class angst and quotidian humanism" +
                " — first learned about the gig economy. The concept fits right in with the veteran director’s moral vision of a world in which ordinary humans regularly think they can outsmart a system designed to destroy them." +
                " In this infuriating, heartbreaking drama, a middle-aged former builder starts driving a truck making e-commerce deliveries and discovers that his dream of being his own boss is the cruelest of illusions. Meanwhile, his wife," +
                " a home health-aide worker, struggles with her own corner of a so-called growth industry. What makes this one of Loach’s best isn’t just its rage (which is plentiful) but its compassion (which is overwhelming)." +
                "It offers a touching cross section of humanity, in which everybody is caught inside a giant machine that discards the weak, feeds on the strong, and perpetuates itself.","https://pyxis.nymag.com/v1/imgs/65e/cb6/4c5f4d108fa1d7f5b04e15a5ce49364b27-04-sorry-we-missed-you.rhorizontal.w700.jpg");
        dramaMovieList.add(six);

        Movie seven = new Movie("Never Rarely Sometimes Always",4,2020,"Exhilaratingly political but unfailingly intimate, Eliza Hittman’s third film is a thriller whose antagonist isn’t a person, but a society " +
                "bent on treating the bodies of the main characters as common property. Never Rarely Sometimes Always takes place over the course of a few days in which a pregnant teenager travels with her cousin to New York City to obtain " +
                "the abortion that restrictions have made unavailable to her in their home state of Pennsylvania. The precariousness of their situation, which soon stretches beyond the capacity of their meager resources, is counterbalanced" +
                " by the strength of their bond. Newcomers Sidney Flanigan and Talia Ryder aren’t just magnetic — they convey, often without words, what it means to have someone to really rely on.","https://pyxis.nymag.com/v1/imgs/344/1fd/9663a5f141ecc78b2b6dba1b60c32f16cd-sundance-never-maybe-sometimes-always-1.rhorizontal.w700.jpg");
        dramaMovieList.add(seven);

        Movie eight = new Movie("First Cow",4,2019,"The rhythms of Kelly Reichardt’s hardscrabble 19th-century Pacific Northwest frontier drama are idiosyncratic if not inscrutable, which is why you’re unprepared" +
                " for sudden revelations or flashes of connection. Her focus (after some throat-clearing) is the bond between two criminally endearing men: a mild-mannered baker (John Magaro) and an enterprising Chinese immigrant (Orion Lee), " +
                "who hatches a plan to squeeze milk every night from the region’s lone bovine (owned by the county’s wealthiest man). The doughnuts they fry up make them gobs of money while leaving them open to mob justice, and you’re torn " +
                "between elation (take that, rich ass!) and dread. It opens with a line from Blake: “The bird, a nest, the spider, a web, man friendship” — an assertion that home isn’t a place or thing but a connection to someone not you." +
                " This haunting movie transports you to another world — and redefines home.","https://pyxis.nymag.com/v1/imgs/2f7/e46/acaa417fb2b1db6ace3b3bb90f7618acca-6-first-cow.rhorizontal.w700.jpg");
        dramaMovieList.add(eight);

        Movie nine = new Movie("The Way Back",5,2016,"Ben Affleck gets one of his greatest (and most personally resonant) roles as an alcoholic former high-school basketball star who gets a chance at " +
                "redemption when he’s hired to coach his alma mater’s hopeless hoops team. This could easily become mired in clichés, but director Gavin O’Connor and writer Brad Ingelsby strike a fine balance between delivering the " +
                "promised underdog sports drama and presenting a portrait of trauma and grief that resists easy solutions. At the center of it all is the star’s tense, restrained performance as an emotionally distant man whose considerable" +
                " demons can’t really be vanquished with a few wins.","https://pyxis.nymag.com/v1/imgs/6ee/bb0/a0ead6e696303efdbcc414ff4bc78b8b6b-03-the-way-back.rhorizontal.w700.jpg");
        dramaMovieList.add(nine);

        Movie ten = new Movie("Swallow",4,2018,"Haley Bennett is absurdly good as a Hudson Valley housewife who’s sleepwalking through a controlling marriage until a psychological disorder forces her into awareness." +
                " Carlo Mirabella-Davis’s psychological drama is an exploration of domestic oppression and unexamined expectations of motherhood — but it’s also its own kind of body-horror story, as its heroine finds herself indulging in the urge " +
                "to swallow things that were never intended for human consumption. These increasingly disturbing spectacles are enfolded in a movie that’s otherwise mesmerizingly beautiful, like a dream that gives way to a nightmare before dumping " +
                "you, abruptly, back into the land of the living.","https://pyxis.nymag.com/v1/imgs/960/249/4fc1a77084176eda4f3553ae5ca8eba779-17-swallow-2.rhorizontal.w700.jpg");
        dramaMovieList.add(ten);

        Movie eleven = new Movie("Lost Girls",3,2018,"Liz Garbus’s grim Netflix drama is based on Robert Kolker’s powerfully empathetic book about the victims of a still-at-large Long Island serial killer believed to" +
                " have butchered between 10 and 16 female sex workers — whose bodies lay for years on a stretch of Gilgo Beach. Garbus focuses on the conflict between a working-class mother (Amy Ryan) whose oldest daughter has disappeared and the " +
                "Suffolk County Police — led by a grave, empty suit (Gabriel Byrne) — who don’t exactly put themselves out for missing “hookers.” The film lacks the scope of Kolker’s book, but in tracing a link between murderous misogyny and" +
                " patriarchal indifference it leaves you bereft (Why aren’t they acting like committed TV cops?) and then outraged. It’s an anti-police procedural.","https://pyxis.nymag.com/v1/imgs/bf6/6d2/2745a402ab427074b6958ea2b9fbb18e20-12-lost-girls.rhorizontal.w700.jpg");
        dramaMovieList.add(eleven);

        Movie twelve = new Movie("Blow the Man Down",5,2020,"This one didn’t open theatrically, so once upon a time it probably wouldn’t have qualified for this list. But screw it, we live in extraordinary times — " +
                "and besides, this atmospheric murder " +
                "thriller set in a small New England fishing village is the kind of artfully mounted, suspenseful little charmer they don’t really make anymore, so it feels extra special. Two cash-strapped sisters, struggling to hold onto their " +
                "house in the wake of their mom’s death, find themselves in the middle of what appears to be an elaborate, twisted conspiracy involving the town brothel and a gaggle of old-timers with some dark secrets. The central mystery itself " +
                "is interesting, but the main attractions here are the colorful cast of characters and the compelling sense of place established by writer-directors Bridget Savage Cole and Danielle Krudy.","https://pyxis.nymag.com/v1/imgs/a46/641/06904071a01ccbe9b57bd1589d9350866a-blow-the-man-down.rhorizontal.w700.jpg");
        dramaMovieList.add(twelve);

        Movie thirteen = new Movie("Bacurau",3,2017,"A rural village in the sertão comes under attack in this film from Juliano Dornelles and Kleber Mendonça Filho. To say more about the culprits would constitute a " +
                "spoiler, but rest assured that Udo Kier is involved. Bacurau is a blood-pumping exploitation riff and a ferocious anti-colonialist protest, a movie in which a ragtag, uniquely Brazilian settlement proves itself to be more resilient" +
                " than any corrupt politician or rapacious outsider. As an inadvertent coronavirus-era release, it also offers a message that’s the perfect mix of encouraging and unsettling — that communities can pull together where governments fail," +
                " but that a sense of community has to be earned.","https://pyxis.nymag.com/v1/imgs/92c/033/5fddd4bd6561948b3444716c30558cafcc-16-bacurao-cannes.rhorizontal.w700.jpg");
        dramaMovieList.add(thirteen);

        Movie fourteen = new Movie("Super Intellligence",5,2020,"Not a lot is known about Melissa McCarthy’s latest collaboration with Ben Falcone, her " +
                "husband and producing partner. What we do know for sure is that McCarthy will play Carol Peters, who is chosen by the government to be observed by a superintelligent " +
                "A.I. with the voice of James Corden, a situation that will undoubtedly set in motion a series of wacky mishaps. The movie is slated to be released on the new streaming" +
                " service, HBO Max, so you won’t even have to leave your house to sit back and watch McCarthy’s particular brand of hilarity ensue.","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/76th-annual-golden-globe-awards-pictured-melissa-mccarthy-news-photo-1585754301.jpg?resize=768:*");
        dramaMovieList.add(fourteen);

        Movie fifteen = new Movie("Free Guy",4,2020,"When a certain unnamed movie in early 2019 tried to explore what happens when a video game character " +
                "becomes aware of his situation (no spoilers here!), it was a disastrous flop. Free Guy, however, appears to be taking a more palatable approach to a similar plot: Ryan Reynolds" +
                " plays a video game character who becomes sentient and attempts to become the game-saving hero before the entire game is taken offline. If the trailer is any indication, it’ll be" +
                " full of Deadpool-style humor, and we’ll get to see Jodie Comer as something other than a stylish serial killer (though, she's still equipped with a Villanelle-approved accent and " +
                "wig)","https://m.media-amazon.com/images/M/MV5BYTNjNzFiZTItNDM5NS00ODBhLTk5NmMtYzUyZWRmOWJjOTI3XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UX182_CR0,0,182,268_AL_.jpg");
        dramaMovieList.add(fifteen);



    }

    public List<Movie> getActionMovieList(){
        return actionMovieList;
    }

    public List<Movie> getComedyMovieList(){
        return comedyMovieList;
    }

    public List<Movie> getDramaMovieList(){
        return dramaMovieList;
    }


}
