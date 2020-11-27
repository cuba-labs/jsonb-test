-- begin JSONB_PERSON
create table JSONB_PERSON (
    ID serial,
    --
    NAME varchar(255) not null,
    ADDRESS jsonb,
    --
    primary key (ID)
)^
-- end JSONB_PERSON
