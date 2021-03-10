drop database if exists MovieReview;
create database MovieReview;
use MovieReview;

create table movie (
	id				int				primary key auto_increment,
    title			varchar(100)	not null,
    genre			varchar(100)	not null,
	released		date			not null,
    rating			varchar(5)		not null
);

create table score (
	id				int				primary key auto_increment,
    premise			int				not null,
    plotPace		int				not null,
    plotIntegrity	int				not null,
    plotComplexity	int				not null,
    theme			int				not null,
    musicalScore	int				not null,
    acting			int				not null,
    cinematography	int				not null,
    costume			int				not null,
    specialEffects	int				not null,
    
    constraint premiseRange check (premise between 0 and 11),
    constraint plotPaceRange check (plotPace between 0 and 11),
    constraint plotIntegrityRange check (plotIntegrity between 0 and 11),
    constraint plotComplexityRange check (plotComplexity between 0 and 11),
    constraint themeRange check (theme between 0 and 11),
    constraint musicalScoreRange check (musicalScore between 0 and 11),
    constraint actingRange check (acting between 0 and 11),
    constraint cinematographyRange check (cinematography between 0 and 11),
    constraint costumeRange check (costume between 0 and 11),
    constraint specialEffectsRange check (specialEffects between 0 and 1)
);