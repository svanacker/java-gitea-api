/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.api;

import io.gitea.ApiException;
import io.gitea.model.AccessToken;
import io.gitea.model.AccessTokenName;
import io.gitea.model.CreateEmailOption;
import io.gitea.model.CreateGPGKeyOption;
import io.gitea.model.CreateKeyOption;
import io.gitea.model.CreateRepoOption;
import io.gitea.model.DeleteEmailOption;
import io.gitea.model.Email;
import io.gitea.model.GPGKey;
import io.gitea.model.PublicKey;
import io.gitea.model.Repository;
import io.gitea.model.TrackedTime;
import io.gitea.model.User;
import io.gitea.model.UserSearchList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Create a repository
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCurrentUserRepoTest() throws ApiException {
        CreateRepoOption body = null;
        Repository response = api.createCurrentUserRepo(body);

        // TODO: test validations
    }
    
    /**
     * Add email addresses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userAddEmailTest() throws ApiException {
        CreateEmailOption body = null;
        List<Email> response = api.userAddEmail(body);

        // TODO: test validations
    }
    
    /**
     * Check if one user is following another user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCheckFollowingTest() throws ApiException {
        String follower = null;
        String followee = null;
        api.userCheckFollowing(follower, followee);

        // TODO: test validations
    }
    
    /**
     * Create an access token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCreateTokenTest() throws ApiException {
        String username = null;
        AccessTokenName accessTokenName = null;
        AccessToken response = api.userCreateToken(username, accessTokenName);

        // TODO: test validations
    }
    
    /**
     * Check whether a user is followed by the authenticated user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentCheckFollowingTest() throws ApiException {
        String username = null;
        api.userCurrentCheckFollowing(username);

        // TODO: test validations
    }
    
    /**
     * Whether the authenticated is starring the repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentCheckStarringTest() throws ApiException {
        String owner = null;
        String repo = null;
        api.userCurrentCheckStarring(owner, repo);

        // TODO: test validations
    }
    
    /**
     * Unfollow a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentDeleteFollowTest() throws ApiException {
        String username = null;
        api.userCurrentDeleteFollow(username);

        // TODO: test validations
    }
    
    /**
     * Remove a GPG key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentDeleteGPGKeyTest() throws ApiException {
        Integer id = null;
        api.userCurrentDeleteGPGKey(id);

        // TODO: test validations
    }
    
    /**
     * Delete a public key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentDeleteKeyTest() throws ApiException {
        Integer id = null;
        api.userCurrentDeleteKey(id);

        // TODO: test validations
    }
    
    /**
     * Unstar the given repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentDeleteStarTest() throws ApiException {
        String owner = null;
        String repo = null;
        api.userCurrentDeleteStar(owner, repo);

        // TODO: test validations
    }
    
    /**
     * Get a GPG key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentGetGPGKeyTest() throws ApiException {
        Integer id = null;
        GPGKey response = api.userCurrentGetGPGKey(id);

        // TODO: test validations
    }
    
    /**
     * Get a public key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentGetKeyTest() throws ApiException {
        Integer id = null;
        PublicKey response = api.userCurrentGetKey(id);

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s followers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListFollowersTest() throws ApiException {
        List<User> response = api.userCurrentListFollowers();

        // TODO: test validations
    }
    
    /**
     * List the users that the authenticated user is following
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListFollowingTest() throws ApiException {
        List<User> response = api.userCurrentListFollowing();

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s GPG keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListGPGKeysTest() throws ApiException {
        List<GPGKey> response = api.userCurrentListGPGKeys();

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s public keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListKeysTest() throws ApiException {
        List<PublicKey> response = api.userCurrentListKeys();

        // TODO: test validations
    }
    
    /**
     * List the repos that the authenticated user owns or has access to
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListReposTest() throws ApiException {
        List<Repository> response = api.userCurrentListRepos();

        // TODO: test validations
    }
    
    /**
     * The repos that the authenticated user has starred
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListStarredTest() throws ApiException {
        List<Repository> response = api.userCurrentListStarred();

        // TODO: test validations
    }
    
    /**
     * List repositories watched by the authenticated user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentListSubscriptionsTest() throws ApiException {
        List<Repository> response = api.userCurrentListSubscriptions();

        // TODO: test validations
    }
    
    /**
     * Create a GPG key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentPostGPGKeyTest() throws ApiException {
        CreateGPGKeyOption form = null;
        GPGKey response = api.userCurrentPostGPGKey(form);

        // TODO: test validations
    }
    
    /**
     * Create a public key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentPostKeyTest() throws ApiException {
        CreateKeyOption body = null;
        PublicKey response = api.userCurrentPostKey(body);

        // TODO: test validations
    }
    
    /**
     * Follow a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentPutFollowTest() throws ApiException {
        String username = null;
        api.userCurrentPutFollow(username);

        // TODO: test validations
    }
    
    /**
     * Star the given repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentPutStarTest() throws ApiException {
        String owner = null;
        String repo = null;
        api.userCurrentPutStar(owner, repo);

        // TODO: test validations
    }
    
    /**
     * List the current user&#39;s tracked times
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userCurrentTrackedTimesTest() throws ApiException {
        List<TrackedTime> response = api.userCurrentTrackedTimes();

        // TODO: test validations
    }
    
    /**
     * delete an access token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userDeleteAccessTokenTest() throws ApiException {
        String username = null;
        Integer token = null;
        api.userDeleteAccessToken(username, token);

        // TODO: test validations
    }
    
    /**
     * Delete email addresses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userDeleteEmailTest() throws ApiException {
        DeleteEmailOption body = null;
        api.userDeleteEmail(body);

        // TODO: test validations
    }
    
    /**
     * Get a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetTest() throws ApiException {
        String username = null;
        User response = api.userGet(username);

        // TODO: test validations
    }
    
    /**
     * Get the authenticated user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetCurrentTest() throws ApiException {
        User response = api.userGetCurrent();

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s access tokens
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetTokensTest() throws ApiException {
        String username = null;
        List<AccessToken> response = api.userGetTokens(username);

        // TODO: test validations
    }
    
    /**
     * List the authenticated user&#39;s email addresses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListEmailsTest() throws ApiException {
        List<Email> response = api.userListEmails();

        // TODO: test validations
    }
    
    /**
     * List the given user&#39;s followers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListFollowersTest() throws ApiException {
        String username = null;
        List<User> response = api.userListFollowers(username);

        // TODO: test validations
    }
    
    /**
     * List the users that the given user is following
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListFollowingTest() throws ApiException {
        String username = null;
        List<User> response = api.userListFollowing(username);

        // TODO: test validations
    }
    
    /**
     * List the given user&#39;s GPG keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListGPGKeysTest() throws ApiException {
        String username = null;
        List<GPGKey> response = api.userListGPGKeys(username);

        // TODO: test validations
    }
    
    /**
     * List the given user&#39;s public keys
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListKeysTest() throws ApiException {
        String username = null;
        List<PublicKey> response = api.userListKeys(username);

        // TODO: test validations
    }
    
    /**
     * List the repos owned by the given user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListReposTest() throws ApiException {
        String username = null;
        List<Repository> response = api.userListRepos(username);

        // TODO: test validations
    }
    
    /**
     * The repos that the given user has starred
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListStarredTest() throws ApiException {
        String username = null;
        List<Repository> response = api.userListStarred(username);

        // TODO: test validations
    }
    
    /**
     * List the repositories watched by a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userListSubscriptionsTest() throws ApiException {
        String username = null;
        List<Repository> response = api.userListSubscriptions(username);

        // TODO: test validations
    }
    
    /**
     * Search for users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userSearchTest() throws ApiException {
        String q = null;
        Integer limit = null;
        UserSearchList response = api.userSearch(q, limit);

        // TODO: test validations
    }
    
    /**
     * List a user&#39;s tracked times in a repo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userTrackedTimesTest() throws ApiException {
        String owner = null;
        String repo = null;
        String user = null;
        List<TrackedTime> response = api.userTrackedTimes(owner, repo, user);

        // TODO: test validations
    }
    
}
