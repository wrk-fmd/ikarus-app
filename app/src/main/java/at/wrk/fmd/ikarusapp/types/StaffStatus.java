package at.wrk.fmd.ikarusapp.types;

/**
 * The possible states of the Staff.status property
 *
 * @see https://github.com/wrk-fmd/ikarus-backend/blob/develop/doc/types.md
 */
public enum StaffStatus
{

	/**
	 * The Staff is no registered yet
	 */
	NOT_REGISTERED,

	/**
	 * The Staff ist registered
	 */
	REGISTERED,

	/**
	 * The Staff is registered and got there material
	 */
	REGISTERED_WITH_MATERIAL,

	/**
	 * The Staff has returned the material and has left the event
	 */
	DEREGISTERED
}
