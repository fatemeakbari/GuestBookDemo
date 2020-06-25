create index IX_F93383D6 on GB_Entry (groupId, guestBookId);
create index IX_B5EF5128 on GB_Entry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C1EA01AA on GB_Entry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_57276527 on GB_GuestBook (groupId);
create index IX_12E2CE17 on GB_GuestBook (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3E25EE59 on GB_GuestBook (uuid_[$COLUMN_LENGTH:75$], groupId);