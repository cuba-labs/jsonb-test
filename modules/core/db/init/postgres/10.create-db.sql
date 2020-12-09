-- begin JSONB_PERSON
create table JSONB_PERSON (
    ID serial,
    --
    NAME varchar(255) not null,
    ADDRESS jsonb,
    COMPANY_ID uuid,
    --
    primary key (ID)
)^
-- end JSONB_PERSON
-- begin JSONB_COMPANY
create table JSONB_COMPANY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end JSONB_COMPANY
create table JSONB_COMPANY_ADDRESSES (
    JSONB_COMPANY_ID uuid,
    ADDRESSES jsonb
)^
