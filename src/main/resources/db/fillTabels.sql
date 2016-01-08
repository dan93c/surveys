USE `surveys_db`;

insert into `surveys`(SVYNAME, SVYDSC, SVYCRTTIME, SVYCRTUSER) 
	values('Testeaza-ti capacitatea de concentrare', '', '2016-01-08 18:34:35', 'admin');
select * from surveys;

insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Ceilalti ma intrerup tot timpul.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Atunci cand sunt intrerupt imi este greu sa revin la ceea ce faceam.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Atunci cand cineva ma intrerupe imi este greu sa-i spun sa ma lase sa revin la ceea ce lucram.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Mi se intampla frecvent sa imi fie distrasa atentia.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Imi este greu sa ma concentrez.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Deseori le cer celorlalti sa repete ce au spus', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Visez mult cu ochii deschisi.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('La sfarsitul zilei ma simt adesea frustrat, deoarece nu am reusit sa duc ceva pana la capat.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Ma simt adesea imprastiat si ineficient.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
insert into `questions` (QSTTXT, QSTTYPE, QSTANS, QSTCRTTIME, QSTCRTUSER, QSTSVY)
	values('Cand cineva vine in biroul meu se simte foarte confortabil.', 'selectOne', 
    'Total adevarat;Destul de adevarat;Mai mult fals;Total fals', '2016-01-08 18:34:35', 'admin', 1);
select * from `questions`;

insert into `survey_results`(SVRCRTTIME, SVRCRTUSER, SVRSVY) values('2016-01-08 18:50:35', 'ovi', 1);
select * from `survey_results`;

insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Mai mult fals.', '2016-01-08 18:50:35', 'ovi', 1, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Destul de adevarat.', '2016-01-08 18:50:35', 'ovi', 2, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Total fals.', '2016-01-08 18:50:35', 'ovi', 3, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Total adevarat.', '2016-01-08 18:50:35', 'ovi', 4, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Destul de adevrat.', '2016-01-08 18:50:35', 'ovi', 5, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Destul de adevarat.', '2016-01-08 18:50:35', 'ovi', 6, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Mai mult fals.', '2016-01-08 18:50:35', 'ovi', 7, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Mai mult fals.', '2016-01-08 18:50:35', 'ovi', 8, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Mai mult fals.', '2016-01-08 18:50:35', 'ovi', 9, 1);
insert into `completed_answers` (ANSTXT, ANSCRTTIME, ANSCRTUSER, ANSQST, ANSSVR)
	values('Mai mult fals.', '2016-01-08 18:50:35', 'ovi', 10, 1);

select * from `completed_answers` 