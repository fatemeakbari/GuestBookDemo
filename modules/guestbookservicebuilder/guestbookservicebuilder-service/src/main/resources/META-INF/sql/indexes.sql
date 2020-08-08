create index IX_F93383D6 on GB_Entry (groupId, guestBookId);
create index IX_535BE3DC on GB_Entry (groupId, status);
create index IX_2DDEBF1A on GB_Entry (status);
create index IX_B5EF5128 on GB_Entry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C1EA01AA on GB_Entry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5E9D8D0D on GB_GuestBook (groupId, status);
create index IX_7D8DCAC9 on GB_GuestBook (status);
create index IX_12E2CE17 on GB_GuestBook (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3E25EE59 on GB_GuestBook (uuid_[$COLUMN_LENGTH:75$], groupId);