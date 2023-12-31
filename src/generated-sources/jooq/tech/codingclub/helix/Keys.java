/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<tech.codingclub.helix.tables.records.MemberRecord, java.lang.Long> IDENTITY_MEMBER = Identities0.IDENTITY_MEMBER;
	public static final org.jooq.Identity<tech.codingclub.helix.tables.records.TweetRecord, java.lang.Long> IDENTITY_TWEET = Identities0.IDENTITY_TWEET;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.FollowerRecord> FOLLOWER_USER_ID_FOLLOWING_ID_KEY = UniqueKeys0.FOLLOWER_USER_ID_FOLLOWING_ID_KEY;
	public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MemberRecord> CONSTRAINTS = UniqueKeys0.CONSTRAINTS;
	public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MemberRecord> MEMBER_PKEY = UniqueKeys0.MEMBER_PKEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWER__FOLLOWER_USER_ID_FKEY = ForeignKeys0.FOLLOWER__FOLLOWER_USER_ID_FKEY;
	public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWER__FOLLOWER_USER_ID_FKEY1 = ForeignKeys0.FOLLOWER__FOLLOWER_USER_ID_FKEY1;
	public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWER__FOLLOWER_FOLLOWING_ID_FKEY = ForeignKeys0.FOLLOWER__FOLLOWER_FOLLOWING_ID_FKEY;
	public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWER__FOLLOWER_FOLLOWING_ID_FKEY1 = ForeignKeys0.FOLLOWER__FOLLOWER_FOLLOWING_ID_FKEY1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<tech.codingclub.helix.tables.records.MemberRecord, java.lang.Long> IDENTITY_MEMBER = createIdentity(tech.codingclub.helix.tables.Member.MEMBER, tech.codingclub.helix.tables.Member.MEMBER.ID);
		public static org.jooq.Identity<tech.codingclub.helix.tables.records.TweetRecord, java.lang.Long> IDENTITY_TWEET = createIdentity(tech.codingclub.helix.tables.Tweet.TWEET, tech.codingclub.helix.tables.Tweet.TWEET.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.FollowerRecord> FOLLOWER_USER_ID_FOLLOWING_ID_KEY = createUniqueKey(tech.codingclub.helix.tables.Follower.FOLLOWER, tech.codingclub.helix.tables.Follower.FOLLOWER.USER_ID, tech.codingclub.helix.tables.Follower.FOLLOWER.FOLLOWING_ID);
		public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MemberRecord> CONSTRAINTS = createUniqueKey(tech.codingclub.helix.tables.Member.MEMBER, tech.codingclub.helix.tables.Member.MEMBER.EMAIL);
		public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MemberRecord> MEMBER_PKEY = createUniqueKey(tech.codingclub.helix.tables.Member.MEMBER, tech.codingclub.helix.tables.Member.MEMBER.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWER__FOLLOWER_USER_ID_FKEY = createForeignKey(tech.codingclub.helix.Keys.MEMBER_PKEY, tech.codingclub.helix.tables.Follower.FOLLOWER, tech.codingclub.helix.tables.Follower.FOLLOWER.USER_ID);
		public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWER__FOLLOWER_USER_ID_FKEY1 = createForeignKey(tech.codingclub.helix.Keys.MEMBER_PKEY, tech.codingclub.helix.tables.Follower.FOLLOWER, tech.codingclub.helix.tables.Follower.FOLLOWER.USER_ID);
		public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWER__FOLLOWER_FOLLOWING_ID_FKEY = createForeignKey(tech.codingclub.helix.Keys.MEMBER_PKEY, tech.codingclub.helix.tables.Follower.FOLLOWER, tech.codingclub.helix.tables.Follower.FOLLOWER.FOLLOWING_ID);
		public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowerRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWER__FOLLOWER_FOLLOWING_ID_FKEY1 = createForeignKey(tech.codingclub.helix.Keys.MEMBER_PKEY, tech.codingclub.helix.tables.Follower.FOLLOWER, tech.codingclub.helix.tables.Follower.FOLLOWER.FOLLOWING_ID);
	}
}
